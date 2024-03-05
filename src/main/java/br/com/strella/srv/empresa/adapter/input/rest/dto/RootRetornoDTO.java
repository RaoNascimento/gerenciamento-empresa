package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@NoArgsConstructor
@AllArgsConstructor
public class RootProfissionalDTO<T> {
	@JsonProperty("dados")
	List<T> list;
	@JsonProperty("codigo retorno")
	HttpStatus httpStatus;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	//	@JsonProperty("dados")
//	public List<T> profissionalInputDTOList() {
//		return profissionalInputDTOList;
//	}
//
//	@Override
//	@JsonProperty("codigo retorno")
//	public HttpStatus httpStatus() {
//		return httpStatus;
//	}
}
