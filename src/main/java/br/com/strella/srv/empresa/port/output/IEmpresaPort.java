package br.com.strella.srv.empresa.port.output;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IEmpresaPort {

	public Empresa cadastraArquivo(Empresa empresa);
	public List<Empresa> listarEmpresas(Empresa filtrosSelecionados, Pageable pageable);
}
