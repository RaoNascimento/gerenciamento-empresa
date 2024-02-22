package br.com.strella.srv.empresa.port.output;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IEmpresaPort {

	public Empresa cadastrarEmpresa(Empresa empresa);
	public Empresa editarEmpresa(Empresa empresa);
	public List<Empresa> listarEmpresas(Empresa filtrosSelecionados, Pageable pageable);
	public void deletarEmpresa(Empresa empresa) throws Exception;
}
