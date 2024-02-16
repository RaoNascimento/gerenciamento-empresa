package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RootEmpresaDTO {

	@JsonProperty("codigo_retorno")
	private String codigoRetorno;

	@JsonProperty("dados")
	private EmpresaInputDTO empresaInputDTO;

	public RootEmpresaDTO(EmpresaInputDTO empresaInputDTO, String codigoRetorno){
	this.codigoRetorno = codigoRetorno;
	this.empresaInputDTO = empresaInputDTO;
	}
}
