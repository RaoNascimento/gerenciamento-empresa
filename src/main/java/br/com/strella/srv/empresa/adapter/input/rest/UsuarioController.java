package br.com.strella.srv.empresa.adapter.input.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import br.com.strella.srv.empresa.adapter.dto.mapper.UsuarioMapper;
import br.com.strella.srv.empresa.adapter.input.rest.dto.RootUsuarioDTO;
import br.com.strella.srv.empresa.adapter.input.rest.dto.UsuarioInputDTO;
import br.com.strella.srv.empresa.port.input.IUsuario;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class UsuarioController {

	@Autowired
	private final IUsuario usuarioUseCase;

	public UsuarioController(IUsuario usuarioUseCase) {
		this.usuarioUseCase = usuarioUseCase;
	}

	@PostMapping(value = "/strella-usuario", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<RootUsuarioDTO> cadastrar(@RequestBody UsuarioInputDTO usuarioInputDto) throws Exception {

		var usuario = UsuarioMapper.INSTANCE.usuarioInputDTOToUsuario(usuarioInputDto);
		var response = UsuarioMapper.INSTANCE.usuarioToUsuarioInputDTO(usuarioUseCase.cadastrarUsuario(usuario));
		var rootUsuarioDto = new RootUsuarioDTO(Arrays.asList(response), HttpStatus.CREATED);

		return ResponseEntity.status(HttpStatus.CREATED).body(rootUsuarioDto);
	}

}
