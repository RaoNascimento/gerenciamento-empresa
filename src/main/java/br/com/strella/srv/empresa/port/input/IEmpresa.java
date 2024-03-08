package br.com.strella.srv.empresa.port.input;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IEmpresa {
	Empresa cadastrarEmpresa(Empresa empresa);
	Empresa editarEmpresa(Empresa empresa);
	List<Empresa> listarEmpresasViaFiltro(Long id, Long idLogo, String urlAcesso, Long idPlanoEmpresa, Pageable pageable);
	void deletarEmpresa(Long id);
}
