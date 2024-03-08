package br.com.strella.srv.empresa.port.input;

import br.com.strella.srv.empresa.domain.entity.Profissional;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IProfissional {
	Profissional cadastrarProfissional(Profissional profissional);
	Profissional editarProfissional(Profissional profissional);
	List<Profissional> listarProfissionaisViaFiltro(Long id, Long email, String identificacao, Long perfilAcesso,
		String usuUltAlteracao, LocalDate dataAtualizacao, Long idUsuario, Long idImgStrella, Pageable pageable);
	void deletarProfissional(Long id) throws Exception;
}
