package br.com.strella.srv.empresa.port.output;

import br.com.strella.srv.empresa.domain.entity.Profissional;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IProfissionalPort {
	public Profissional cadastrarProfissional(Profissional profissional);
	public Profissional editarProfissional(Profissional profissional);
	public List<Profissional> listarProfissional(Profissional filtrosSelecionados, Pageable pageable);
	public void deletarProfissional(Profissional profissional) throws Exception;
}
