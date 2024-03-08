package br.com.strella.srv.empresa.adapter.output;

import br.com.strella.srv.empresa.adapter.output.repository.ProfissionalRepository;
import br.com.strella.srv.empresa.adapter.output.repository.dto.ProfissionalOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.ProfissionalMapperOutput;
import br.com.strella.srv.empresa.adapter.output.repository.specification.ProfissionalSpecification;
import br.com.strella.srv.empresa.domain.entity.Profissional;
import br.com.strella.srv.empresa.port.output.IProfissionalPort;
import java.util.List;
import org.springframework.data.domain.Pageable;

public class ProfissionalAdapter implements IProfissionalPort {
	private final ProfissionalRepository profissionalRepository;
	private ProfissionalSpecification profissionalSpecification;

	public ProfissionalAdapter(ProfissionalRepository profissionalRepository,
		ProfissionalSpecification profissionalSpecification) {
		this.profissionalRepository = profissionalRepository;
		this.profissionalSpecification = profissionalSpecification;
	}

	@Override
	public Profissional cadastrarProfissional(Profissional profissional) {
		ProfissionalOutputDTO profissionalOutputDTO = ProfissionalMapperOutput.INSTANCE.profissionalToProfissionalOutputDTO(profissional);
		var response = profissionalRepository.save(profissionalOutputDTO);
		return ProfissionalMapperOutput.INSTANCE.profissionalOutputDTOToProfissional(response);
	}

	@Override
	public Profissional editarProfissional(Profissional profissional) {
		return null;
	}

	@Override
	public List<Profissional> listarProfissional(Profissional filtrosSelecionados,
		Pageable pageable) {
		return null;
	}

	@Override
	public void deletarProfissional(Profissional profissional) throws Exception {
		ProfissionalOutputDTO profissionalOutputDTO = ProfissionalMapperOutput.INSTANCE.profissionalToProfissionalOutputDTO(profissional);
		profissionalRepository.delete(profissionalOutputDTO);

	}
}
