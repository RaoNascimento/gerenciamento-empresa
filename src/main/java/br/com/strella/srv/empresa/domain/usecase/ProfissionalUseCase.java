package br.com.strella.srv.empresa.domain.usecase;

import br.com.strella.srv.empresa.domain.entity.Profissional;
import br.com.strella.srv.empresa.port.input.IProfissional;
import br.com.strella.srv.empresa.port.output.IProfissionalPort;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;

public class ProfissionalUseCase implements IProfissional {
	private final IProfissionalPort profissionalAdapter;

	public ProfissionalUseCase(IProfissionalPort profissionalAdapter) {
		this.profissionalAdapter = profissionalAdapter;
	}


	@Override
	public Profissional cadastrarProfissional(Profissional profissional) {
		return profissionalAdapter.cadastrarProfissional(profissional);
	}

	@Override
	public Profissional editarProfissional(Profissional profissional) {
		return profissionalAdapter.editarProfissional(profissional);
	}

	@Override
	public List<Profissional> listarProfissionaisViaFiltro(Long id, Long email, String identificacao,
		Long perfilAcesso, String usuUltAlteracao, LocalDate dataAtualizacao, Long idUsuario,
		Long idImgStrella, Pageable pageable) {
		return profissionalAdapter.listarProfissional(null, null);
	}

	@Override
	public void deletarProfissional(Long id) throws Exception {
		Profissional profissional = new Profissional();
		profissional.setId(id);
		profissionalAdapter.deletarProfissional(profissional);
	}
}
