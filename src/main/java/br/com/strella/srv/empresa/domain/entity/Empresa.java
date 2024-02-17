package br.com.strella.srv.empresa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;


public class Empresa implements Serializable {

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlAcesso() {
		return urlAcesso;
	}

	public void setUrlAcesso(String urlAcesso) {
		this.urlAcesso = urlAcesso;
	}

	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getIdPlanoEmpresa() {
		return idPlanoEmpresa;
	}

	public void setIdPlanoEmpresa(Long idPlanoEmpresa) {
		this.idPlanoEmpresa = idPlanoEmpresa;
	}

	public Long getIdLogo() {
		return idLogo;
	}

	public void setIdLogo(Long idLogo) {
		this.idLogo = idLogo;
	}
}

