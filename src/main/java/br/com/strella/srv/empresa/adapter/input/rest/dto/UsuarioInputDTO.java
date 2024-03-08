package br.com.strella.srv.empresa.adapter.input.rest.dto;

import java.time.LocalDate;
	public record UsuarioInputDTO ( String nome, String ultimoNome, String email,  LocalDate dataNascimento,
							String idGoogle, LocalDate dataAtualizacao, Long idEmpresa){

}
