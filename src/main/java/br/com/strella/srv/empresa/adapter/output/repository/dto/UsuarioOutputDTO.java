package br.com.strella.srv.empresa.adapter.output.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioOutputDTO implements Serializable {
	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	@Column(name = "id")
	private Long id;
	@JsonProperty("nome")
	@Column(name = "nome")
	private String nome;
	@JsonProperty("ultimoNome")
	@Column(name = "ultimo_nome")
	private String ultimoNome;
	@JsonProperty("email")
	@Column(name = "email")
	private String email;
	@JsonProperty("telefone")
	@Column(name = "telefone")
	private String telefone;
	@JsonProperty("dataNascimento")
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	@JsonProperty("idGoogle")
	@Column(name = "id_google")
	private String idGoogle;
	@JsonProperty("perfilAcesso")
	@Column(name = "perfil_acesso")
	private int perfilAcesso;
	@JsonProperty("perguntaRecuperacao")
	@Column(name = "pergunta_recuperacao")
	private String perguntaRecuperacao;
	@JsonProperty("usuUltimaAlteracao")
	@Column(name = "usu_ultima_alteracao")
	private String usuUltimaAlteracao;
	@JsonProperty("dataAtualizacao")
	@Column(name = "data_atualizacao")
	private LocalDate dataAtualizacao;
	//@ManyToMany(mappedBy = "empresas")
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

	public UsuarioOutputDTO() {
	}

	public UsuarioOutputDTO(Long id, String nome, String ultimoNome, String email, String telefone,
		LocalDate dataNascimento, String idGoogle, int perfilAcesso, String perguntaRecuperacao,
		String usuUltimaAlteracao, LocalDate dataAtualizacao, Long idEmpresa) {
		this.id = id;
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.idGoogle = idGoogle;
		this.perfilAcesso = perfilAcesso;
		this.perguntaRecuperacao = perguntaRecuperacao;
		this.usuUltimaAlteracao = usuUltimaAlteracao;
		this.dataAtualizacao = dataAtualizacao;
		this.idEmpresa = idEmpresa;
	}
}
