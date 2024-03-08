package br.com.strella.srv.empresa.adapter.output.repository.specification;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class EmpresaSpecification implements Specification<EmpresaOutputDTO> {
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

	public EmpresaSpecification(Long id, String urlAcesso, String usuUltAlteracao,
		LocalDate dataAtualizacao, Long idPlanoEmpresa, Long idLogo) {
		this.id = id;
		this.urlAcesso = urlAcesso;
		this.usuUltAlteracao = usuUltAlteracao;
		this.dataAtualizacao = dataAtualizacao;
		this.idPlanoEmpresa = idPlanoEmpresa;
		this.idLogo = idLogo;
	}

	public EmpresaSpecification() {

	}
	@Override
	public Predicate toPredicate(Root<EmpresaOutputDTO> root, CriteriaQuery<?> query,
		CriteriaBuilder criteriaBuilder) {

		var predicates = new ArrayList<>();

		if(this.id != null)
			predicates.add(criteriaBuilder.equal(root.get("id"), id));

		if(this.urlAcesso != null)
			predicates.add(criteriaBuilder.equal(root.get("urlAcesso"), urlAcesso));

		if(this.idPlanoEmpresa != null)
			predicates.add(criteriaBuilder.equal(root.get("idPlanoEmpresa"), idPlanoEmpresa));

		if(this.idLogo != null)
			predicates.add(criteriaBuilder.equal(root.get("idLogo"), idLogo));

		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));

	}


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
