package br.com.strella.srv.empresa.domain.usecase;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.port.input.IEmpresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;

public class EmpresaUseCase implements IEmpresa {

	private final IEmpresaPort empresaAdapter;
	public EmpresaUseCase(IEmpresaPort empresaAdapter) {
		this.empresaAdapter = empresaAdapter;
	}

	@Override
	public Empresa cadastrarEmpresa(Empresa empresa) {

		return empresaAdapter.cadastraArquivo(empresa);

	}

}
