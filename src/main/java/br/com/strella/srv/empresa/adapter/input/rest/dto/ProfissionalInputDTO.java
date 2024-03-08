package br.com.strella.srv.empresa.adapter.input.rest.dto;

import java.time.LocalDate;

public record ProfissionalInputDTO(Long id, String nome, String ultimoNome, String telefone, String email, String identificacao, int perfilAcesso
, String usuUltAlteracao, LocalDate dataAtualizacao, Long idUsuario, Long idImgStrella) {

}
