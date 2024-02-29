package br.com.strella.srv.empresa.port.input;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IUsuario {

	Usuario cadastrarUsuario(Usuario usuario);
	List<Usuario> listarUsuariosViaFiltro(Usuario usuario, Pageable pageable);

}
