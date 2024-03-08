package br.com.strella.srv.empresa.domain.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Profissional {
private Long id;
private String nome;
private String ultimoNome;
private String telefone;
private String email;
private String identificacao;
private int perfilAcesso;
private String usuUltAlteracao;
private LocalDate dataAtualizacao;
private Long idUsuario;
private Long idImgStrella;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public int getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(int perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdImgStrella() {
		return idImgStrella;
	}

	public void setIdImgStrella(Long idImgStrella) {
		this.idImgStrella = idImgStrella;
	}
}
