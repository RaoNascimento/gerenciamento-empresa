package br.com.strella.srv.empresa.adapter.input.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class UsuarioInputDTO {
	@JsonProperty("id")
	private Long id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("ultimoNome")
	private String ultimoNome;
	@JsonProperty("email")
	private String email;
	@JsonProperty("telefone")
	private String telefone;
	@JsonProperty("dataNascimento")
	private LocalDate dataNascimento;
	@JsonProperty("idGoogle")
	private String idGoogle;
	@JsonProperty("perfilAcesso")
	private int perfilAcesso;
	@JsonProperty("perguntaRecuperacao")
	private String perguntaRecuperacao;
	@JsonProperty("usuUltimaAlteracao")
	private String usuUltimaAlteracao;
	@JsonProperty("dataAtualizacao")
	private LocalDate dataAtualizacao;
	@JsonProperty("idEmpresa")
	private Long idEmpresa;


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdGoogle() {
		return idGoogle;
	}

	public void setIdGoogle(String idGoogle) {
		this.idGoogle = idGoogle;
	}

	public int getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(int perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public String getPerguntaRecuperacao() {
		return perguntaRecuperacao;
	}

	public void setPerguntaRecuperacao(String perguntaRecuperacao) {
		this.perguntaRecuperacao = perguntaRecuperacao;
	}

	public String getUsuUltimaAlteracao() {
		return usuUltimaAlteracao;
	}

	public void setUsuUltimaAlteracao(String usuUltimaAlteracao) {
		this.usuUltimaAlteracao = usuUltimaAlteracao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
}
