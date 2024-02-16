package br.com.strella.srv.empresa.port.input;

import br.com.strella.srv.empresa.domain.entity.Empresa;

public interface IEmpresa {
	Empresa cadastraArquivoTaje(Empresa empresa);
}
