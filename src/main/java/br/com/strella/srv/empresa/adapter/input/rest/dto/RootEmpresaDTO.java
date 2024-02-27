package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.http.HttpStatus;

public class RootEmpresaDTO {

	@JsonProperty("codigo retorno")
	private HttpStatus codigoRetorno;

//	@JsonProperty("id")
//	private Long id;


	@JsonProperty("dados")
	private List<EmpresaInputDTO> empresaInputDTOList;

	public RootEmpresaDTO(List<EmpresaInputDTO> empresaInputDTOList, HttpStatus codigoRetorno){
		this.codigoRetorno = codigoRetorno;
		this.empresaInputDTOList = empresaInputDTOList;
	}

//	public RootEmpresaDTO(Long id, HttpStatus codigoRetorno ) {
//		this.id = id;
//		this.codigoRetorno = codigoRetorno;
//	}

	public HttpStatus getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(HttpStatus codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public List<EmpresaInputDTO> getEmpresaInputDTOList() {
		return empresaInputDTOList;
	}

	public void setEmpresaInputDTOList(
		List<EmpresaInputDTO> empresaInputDTOList) {
		this.empresaInputDTOList = empresaInputDTOList;
	}
//	public RootEmpresaDTO(final Long id){
//		this.id = id;
//	}
}
