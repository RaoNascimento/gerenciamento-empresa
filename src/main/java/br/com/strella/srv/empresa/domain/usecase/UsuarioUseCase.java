package br.com.strella.srv.empresa.domain.usecase;

import static java.util.Objects.isNull;

import br.com.strella.srv.empresa.domain.entity.Usuario;
import br.com.strella.srv.empresa.port.input.IUsuario;
import br.com.strella.srv.empresa.port.output.IUsuarioPort;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;

public class UsuarioUseCase implements IUsuario {
private final IUsuarioPort usuarioAdapter;

	public UsuarioUseCase(IUsuarioPort usuarioAdapter) {
		this.usuarioAdapter = usuarioAdapter;
	}

	@Override
	public Usuario cadastrarUsuario(Usuario usuario) {
		usuario.setDataAtualizacao(LocalDate.now());

		return usuarioAdapter.cadastrarUsuario(usuario);
	}
	@Override
	public List<Usuario> listarUsuariosViaFiltro(Usuario usu, Pageable pageable){
		Usuario filtrosSelecionados = new Usuario(
			isNull(usu.getNome()) ? null : usu.getNome(),
			isNull(usu.getUltimoNome()) ? null : usu.getUltimoNome(),
			isNull(usu.getEmail()) ? null : usu.getEmail(),
			isNull(usu.getDataNascimento()) ? null: usu.getDataNascimento(),
			isNull(usu.getIdGoogle())? null: usu.getIdGoogle(),
			isNull(usu.getDataAtualizacao()) ? null: usu.getDataAtualizacao(),
			isNull(usu.getIdEmpresa())? null: usu.getIdEmpresa());


		return this.usuarioAdapter.listarUsuario(filtrosSelecionados, pageable);
	}


}
