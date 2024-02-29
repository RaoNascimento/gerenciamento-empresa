package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.UsuarioOutputDTO;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class UsuarioSpecification implements Specification<UsuarioOutputDTO> {

	@Override
	public Predicate toPredicate(Root<UsuarioOutputDTO> root, CriteriaQuery<?> query,
		CriteriaBuilder criteriaBuilder) {
		return null;
	}

	public UsuarioSpecification() {
	}

}
