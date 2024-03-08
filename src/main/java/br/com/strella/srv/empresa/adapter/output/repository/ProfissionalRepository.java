package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.ProfissionalOutputDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProfissionalRepository  extends JpaRepository<ProfissionalOutputDTO,Long>,
	JpaSpecificationExecutor<ProfissionalOutputDTO> {

}
