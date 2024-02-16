package br.com.strella.srv.empresa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Id;


public class Empresa implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	private Long id;

	@JsonProperty("url_acesso")
	private String urlAcesso;

	@JsonProperty("usu_ult_alteracao")
	private String usuUltAlteracao;

	@JsonProperty("data_atualizacao")
	private LocalDate dataAtualizacao;

	@JsonProperty("id_plano_empresa")
	private Long idPlanoEmpresa;

	@JsonProperty("id_logo")
	private Long idLogo;




	}

