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
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profissional")
public class ProfissionalOutputDTO implements Serializable {
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
	@JsonProperty("telefone")
	@Column(name = "telefone")
	private String telefone;
	@JsonProperty("email")
	@Column(name = "email")
	private String email;
	@JsonProperty("identificacao")
	@Column(name = "identificacao")
	private String identificacao;
	@JsonProperty("perfilAcesso")
	@Column(name = "perfilAcesso")
	private int perfilAcesso;
	@JsonProperty("usuUltAlteracao")
	@Column(name = "usu_ult_alteracao")
	private String usuUltAlteracao;
	@JsonProperty("dataAtualizacao")
	@Column(name = "data_atualizacao")
	private LocalDate dataAtualizacao;
	@JsonProperty("idUsuario")
	@Column(name = "id_usuario")
	private Long idUsuario;
	@JsonProperty("idImgStrella")
	@Column(name = "id_img_strella")
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
