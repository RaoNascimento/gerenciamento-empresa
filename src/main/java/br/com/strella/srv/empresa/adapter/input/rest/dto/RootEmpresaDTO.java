package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.http.HttpStatus;

public class RootEmpresaDTO {

	@JsonProperty("codigo retorno")
	private HttpStatus codigoRetorno;

//	@JsonProperty("dados")
//	private EmpresaInputDTO empresaInputDTO;
	@JsonProperty("dados")
	private List<EmpresaInputDTO> empresaInputDTOList;

//	public RootEmpresaDTO(EmpresaInputDTO empresaInputDTO, String codigoRetorno){
//	this.codigoRetorno = codigoRetorno;
//	this.empresaInputDTO = empresaInputDTO;
//	}
	public RootEmpresaDTO(List<EmpresaInputDTO> empresaInputDTOList, HttpStatus codigoRetorno){
		this.codigoRetorno = codigoRetorno;
		this.empresaInputDTOList = empresaInputDTOList;
	}

	public HttpStatus getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(HttpStatus codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

//	public EmpresaInputDTO getEmpresaInputDTO() {
//		return empresaInputDTO;
//	}
//
//	public void setEmpresaInputDTO(
//		EmpresaInputDTO empresaInputDTO) {
//		this.empresaInputDTO = empresaInputDTO;
//	}

	public List<EmpresaInputDTO> getEmpresaInputDTOList() {
		return empresaInputDTOList;
	}

	public void setEmpresaInputDTOList(
		List<EmpresaInputDTO> empresaInputDTOList) {
		this.empresaInputDTOList = empresaInputDTOList;
	}
}
