package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@NoArgsConstructor
public class RootRetornoDTO<T> {
	@JsonProperty("dados")
	private List<T> list;
	@JsonProperty("codigo retorno")
	private HttpStatus httpStatus;

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

	public RootRetornoDTO(List<T> list, HttpStatus httpStatus) {
		this.list = list;
		this.httpStatus = httpStatus;
	}
}
