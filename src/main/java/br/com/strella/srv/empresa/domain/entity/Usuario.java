package br.com.strella.srv.empresa.domain.entity;

import java.time.LocalDate;


public class Usuario {
	private Long id;
	private String nome;
	private String ultimoNome;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;
	private String idGoogle;
	private int perfilAcesso;
	private String perguntaRecuperacao;
	private String usuUltimaAlteracao;
	private LocalDate dataAtualizacao;
	private Long idEmpresa;

	//@OneToMany
//private List<Profissional> profissionais;
//@OneToMany
//private List<Cliente> profissionais;


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

	public Usuario(String nome, String ultimoNome, String email, LocalDate dataNascimento,
		String idGoogle, LocalDate dataAtualizacao, Long idEmpresa) {
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.idGoogle = idGoogle;
		this.dataAtualizacao = dataAtualizacao;
		this.idEmpresa = idEmpresa;
	}
}

