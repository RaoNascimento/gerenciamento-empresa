package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.http.HttpStatus;

public class RootUsuarioDTO {
private List<UsuarioInputDTO> usuarioInputDTOList;
@JsonProperty("codigo retorno")
private HttpStatus httpStatus;

	@JsonProperty("usuarios")
	public List<UsuarioInputDTO> getUsuarioInputDTOList() {
		return usuarioInputDTOList;
	}

	public void setUsuarioInputDTOList(
		List<UsuarioInputDTO> usuarioInputDTOList) {
		this.usuarioInputDTOList = usuarioInputDTOList;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public RootUsuarioDTO(List<UsuarioInputDTO> usuarioInputDTOList, HttpStatus httpStatus) {
		this.usuarioInputDTOList = usuarioInputDTOList;
		this.httpStatus = httpStatus;
	}
}
