package br.com.strella.srv.empresa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import net.bytebuddy.implementation.bind.annotation.Default;


public class Empresa implements Serializable {

	private Long id;

	private String urlAcesso;

	private String usuUltAlteracao;

	private LocalDate dataAtualizacao;

	private Long idPlanoEmpresa;

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

//	public Empresa(Long id, String urlAcesso, String usuUltAlteracao, LocalDate dataAtualizacao,
//		Long idPlanoEmpresa, Long idLogo) {
//		this.id = id;
//		this.urlAcesso = urlAcesso;
//		this.usuUltAlteracao = usuUltAlteracao;
//		this.dataAtualizacao = dataAtualizacao;
//		this.idPlanoEmpresa = idPlanoEmpresa;
//		this.idLogo = idLogo;
//	}

	public Empresa(Long id, String urlAcesso, Long idPlanoEmpresa, Long idLogo) {
		this.id = id;
		this.urlAcesso = urlAcesso;
		this.idPlanoEmpresa = idPlanoEmpresa;
		this.idLogo = idLogo;
	}
	public Empresa(Long id){
		this.id = id;
	}

	public Empresa() {

	}
}

