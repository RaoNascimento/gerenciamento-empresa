package br.com.strella.srv.empresa.port.input;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import java.util.List;

public interface IUsuarioEmpresa {
	List<Empresa> cadastrarEmpresas(List<Empresa> empresa);
	List<Usuario> cadastrarUsuarios(List<Usuario> usuario);
}
