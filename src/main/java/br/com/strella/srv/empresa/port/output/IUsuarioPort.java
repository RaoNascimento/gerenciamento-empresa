package br.com.strella.srv.empresa.port.output;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IUsuarioPort {
	public Usuario cadastrarUsuario(Usuario usuario);
	public Usuario editarUsuario(Usuario usuario);
	public List<Usuario> listarUsuario(Usuario filtrosSelecionados, Pageable pageable);
	public void deletarUsuario(Usuario usuario) throws Exception;

}
