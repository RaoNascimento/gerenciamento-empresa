package br.com.strella.srv.empresa.port.output;

import br.com.strella.srv.empresa.domain.entity.Empresa;

public interface IEmpresaPort {

	public Empresa cadastraArquivo(Empresa empresa);
}
