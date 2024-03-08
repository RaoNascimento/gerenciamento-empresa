package br.com.strella.srv.empresa.adapter.output.repository.specification;

import br.com.strella.srv.empresa.adapter.output.repository.dto.ProfissionalOutputDTO;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class ProfissionalSpecification implements Specification<ProfissionalOutputDTO> {

	@Override
	public Specification<ProfissionalOutputDTO> and(Specification<ProfissionalOutputDTO> other) {
		return Specification.super.and(other);
	}

	@Override
	public Specification<ProfissionalOutputDTO> or(Specification<ProfissionalOutputDTO> other) {
		return Specification.super.or(other);
	}

	@Override
	public Predicate toPredicate(Root<ProfissionalOutputDTO> root, CriteriaQuery<?> query,
		CriteriaBuilder criteriaBuilder) {
		return null;
	}
}
