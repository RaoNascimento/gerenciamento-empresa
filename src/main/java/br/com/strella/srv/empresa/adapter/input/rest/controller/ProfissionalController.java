package br.com.strella.srv.empresa.adapter.input.rest.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import br.com.strella.srv.empresa.adapter.dto.mapper.ProfissionalMapper;
import br.com.strella.srv.empresa.adapter.input.rest.dto.ProfissionalInputDTO;
import br.com.strella.srv.empresa.adapter.input.rest.dto.RootRetornoDTO;
import br.com.strella.srv.empresa.domain.entity.Profissional;
import br.com.strella.srv.empresa.port.input.IProfissional;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProfissionalController {

		@Autowired
		private final IProfissional profissionalUseCase;

		public ProfissionalController(IProfissional profissionalUseCase) {
			this.profissionalUseCase = profissionalUseCase;
		}

		@PostMapping(value = "/strella-profissional", produces = APPLICATION_JSON_VALUE)
		public ResponseEntity<RootRetornoDTO> cadastrar(@RequestBody ProfissionalInputDTO profissionalInputDTO) throws Exception {

			var profissional = ProfissionalMapper.INSTANCE.profissionalInputDTOToProfissional(profissionalInputDTO);
			var response = ProfissionalMapper.INSTANCE
				.profissionalToProfissionalInputDTO(profissionalUseCase.cadastrarProfissional(profissional));
			var rootResponseDto = new RootRetornoDTO(Arrays.asList(response), HttpStatus.CREATED);

			return ResponseEntity.status(HttpStatus.CREATED).body(rootResponseDto);
		}

		@GetMapping(value = "/strella-profissional", produces = APPLICATION_JSON_VALUE)
		public ResponseEntity<RootRetornoDTO> listarPorParametros(
			@RequestParam(name = "id", required = false) Long id,
			@RequestParam(name = "idLogo", required = false) Long idLogo,
			@RequestParam(name = "urlAcesso", required = false) String urlAcesso,
			@RequestParam(name = "idPlanoEmpresa", required = false) Long idPlanoEmpresa,
			@RequestParam(name = "page", required = false, defaultValue = "0") int page,
			@RequestParam(name = "size", required = false, defaultValue = "10") int size) {

//			var retornoConsulta = profissionalUseCase.listarProfissionaisViaFiltro(id, idLogo, urlAcesso,
//				idPlanoEmpresa, PageRequest.of(page, size));

			var root = new RootRetornoDTO(ProfissionalMapper.INSTANCE.listProfissionalToProfissionalInputDTO(null), OK);

			return ResponseEntity.status(OK).body(root);

		}

		@PutMapping(value = "/strella-profissional", produces = APPLICATION_JSON_VALUE)
		public ResponseEntity<RootRetornoDTO> editarProfissional(@RequestBody ProfissionalInputDTO profissionalInputDTO){
			var profissional = ProfissionalMapper.INSTANCE.profissionalInputDTOToProfissional(profissionalInputDTO);
			var retornoConsulta = profissionalUseCase.editarProfissional(profissional);

			var response = ProfissionalMapper.INSTANCE.profissionalToProfissionalInputDTO(retornoConsulta);
			var root = new RootRetornoDTO(Arrays.asList(response), HttpStatus.CREATED);

			return ResponseEntity.status(HttpStatus.CREATED).body(root);
		}

		@DeleteMapping(value = "/strella-profissional", produces = APPLICATION_JSON_VALUE)
		public ResponseEntity<RootRetornoDTO>deletarProfissional(@RequestParam(name = "id", required = true) Long id)
			throws Exception {
			profissionalUseCase.deletarProfissional(id);
			var rootEmpresa = new RootRetornoDTO(null, OK);

			return ResponseEntity.ok().body(rootEmpresa);
		}
}
