package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.mapstruct.Named;

public class EmpresaInputDTO {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("urlAcesso")
	private String urlAcesso;

	@JsonProperty("usuUltAlteracao")
	private String usuUltAlteracao;

	@JsonProperty("dataAtualizacao")
	private LocalDate dataAtualizacao;

	@JsonProperty("idPlanoEmpresa")
	private Long idPlanoEmpresa;

	@JsonProperty("idLogo")
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

	public EmpresaInputDTO(Long id, String urlAcesso, String usuUltAlteracao, LocalDate dataAtualizacao,
		Long idPlanoEmpresa, Long idLogo) {
		this.id = id;
		this.urlAcesso = urlAcesso;
		this.usuUltAlteracao = usuUltAlteracao;
		this.dataAtualizacao = dataAtualizacao;
		this.idPlanoEmpresa = idPlanoEmpresa;
		this.idLogo = idLogo;
	}
	public EmpresaInputDTO() {
	}

}
