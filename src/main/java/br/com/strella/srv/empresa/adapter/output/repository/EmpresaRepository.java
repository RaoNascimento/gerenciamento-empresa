package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaOutputDTO, Long>,
	JpaSpecificationExecutor<EmpresaOutputDTO> {



}
