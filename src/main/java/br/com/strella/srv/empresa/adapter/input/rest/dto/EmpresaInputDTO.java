package br.com.strella.srv.empresa.adapter.input.rest.dto;

import java.time.LocalDate;

public  record EmpresaInputDTO(Long id, String urlAcesso, String usuUltAlteracao,
							  LocalDate dataAtualizacao, Long idPlanoEmpresa, Long idLogo, Long idUsuario) {

}
