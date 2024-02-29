package br.com.strella.srv.empresa.adapter.input.rest;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import br.com.strella.srv.empresa.adapter.dto.mapper.EmpresaMapper;
import br.com.strella.srv.empresa.adapter.input.rest.dto.EmpresaInputDTO;
import br.com.strella.srv.empresa.adapter.input.rest.dto.RootEmpresaDTO;
import br.com.strella.srv.empresa.adapter.input.rest.swagger.SwaggerEmpresaController;
import br.com.strella.srv.empresa.port.input.IEmpresa;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class EmpresaController implements SwaggerEmpresaController {
	@Autowired
	private final IEmpresa empresaUseCase;

	public EmpresaController(IEmpresa empresaUseCase) {
		this.empresaUseCase = empresaUseCase;
	}

	@PostMapping(value = "/strella-empresa", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<RootEmpresaDTO> cadastrar(@RequestBody EmpresaInputDTO empresaInputDto) throws Exception {

		var empresa = EmpresaMapper.INSTANCE.empresaInputDTOToEmpresa(empresaInputDto);
		var response = EmpresaMapper.INSTANCE.empresaToEmpresaInputDTO(empresaUseCase.cadastrarEmpresa(empresa));
		var rootEmpresaDto = new RootEmpresaDTO(Arrays.asList(response), HttpStatus.CREATED);

		return ResponseEntity.status(HttpStatus.CREATED).body(rootEmpresaDto);
	}

	@GetMapping(value = "/strella-empresa", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<RootEmpresaDTO> listarPorParametros(
		@RequestParam(name = "id", required = false) Long id,
		@RequestParam(name = "idLogo", required = false) Long idLogo,
		@RequestParam(name = "urlAcesso", required = false) String urlAcesso,
		@RequestParam(name = "idPlanoEmpresa", required = false) Long idPlanoEmpresa,
		@RequestParam(name = "page", required = false, defaultValue = "0") int page,
		@RequestParam(name = "size", required = false, defaultValue = "10") int size) {

		var retornoConsulta = empresaUseCase.listarEmpresasViaFiltro(id, idLogo, urlAcesso,
			idPlanoEmpresa, PageRequest.of(page, size));

		var response = new RootEmpresaDTO(EmpresaMapper.INSTANCE.listEmpresaToEmpresaInputDTO(retornoConsulta), OK);

		return ResponseEntity.status(OK).body(response);

	}

	@PutMapping(value = "/strella-empresa", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<RootEmpresaDTO> editarEmpresa(@RequestBody EmpresaInputDTO empresaInputDto){
		var empresa = EmpresaMapper.INSTANCE.empresaInputDTOToEmpresa(empresaInputDto);
		var retornoConsulta = empresaUseCase.editarEmpresa(empresa);

		var response = EmpresaMapper.INSTANCE.empresaToEmpresaInputDTO(retornoConsulta);
		var rootEmpresa = new RootEmpresaDTO(Arrays.asList(response), HttpStatus.CREATED);

		return ResponseEntity.status(HttpStatus.CREATED).body(rootEmpresa);
	}

	@DeleteMapping(value = "/strella-empresa", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<RootEmpresaDTO>deletarEmpresa(@RequestParam(name = "id", required = true) Long id){

		EmpresaInputDTO empresaInputDTO = new EmpresaInputDTO();
		empresaInputDTO.setId(id);

		empresaUseCase.deletarEmpresa(EmpresaMapper.INSTANCE.empresaInputDTOToEmpresa(empresaInputDTO));

		var rootEmpresa = new RootEmpresaDTO(null, OK);
		return ResponseEntity.ok().body(rootEmpresa);
	}
}
