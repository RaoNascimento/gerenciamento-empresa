package br.com.strella.srv.empresa.adapter.output.adapter;

import br.com.strella.srv.empresa.adapter.output.repository.UsuarioRepository;
import br.com.strella.srv.empresa.adapter.output.repository.UsuarioSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.dto.UsuarioOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.UsuarioMapperOutput;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import br.com.strella.srv.empresa.domain.exception.ArquivoNotFoudException;
import br.com.strella.srv.empresa.domain.exception.BusinessException;
import br.com.strella.srv.empresa.port.output.IUsuarioPort;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class UsuarioAdapter implements IUsuarioPort{
 private final UsuarioRepository usuarioRepository;
 private UsuarioSpecification usuarioSpecification;

	public UsuarioAdapter(UsuarioRepository usuarioRepository, UsuarioSpecification usuarioSpecification) {
		this.usuarioRepository = usuarioRepository;
		this.usuarioSpecification = usuarioSpecification;
	}

	@Override
	@Transactional
	public Usuario cadastrarUsuario(Usuario usuario) {
		var usu = UsuarioMapperOutput.INSTANCE.usuarioToUsuarioOutputDTO(usuario);
		var response = usuarioRepository.saveAndFlush(usu);

		return UsuarioMapperOutput.INSTANCE.usuarioOutputDTOToUsuario(response);
	}

	@Override
	public Usuario editarUsuario(Usuario usuario) {
		UsuarioOutputDTO usuarioOutputDTO = UsuarioMapperOutput.INSTANCE.usuarioToUsuarioOutputDTO(usuario);
		return UsuarioMapperOutput.INSTANCE.usuarioOutputDTOToUsuario(usuarioRepository.saveAndFlush(usuarioOutputDTO));
	}

	@Override
	public List<Usuario> listarUsuario(Usuario filtrosSelecionados, Pageable pageable) {
		this.usuarioSpecification = UsuarioMapperOutput.INSTANCE.usuarioOutputDTOToUsuarioEspecification(filtrosSelecionados);
		var lista = usuarioRepository.findAll(this.usuarioSpecification, pageable).toList();

		return  UsuarioMapperOutput.INSTANCE.listUsuarioOutputDTOToUsuario(lista);
	}

	@Override
	public void deletarUsuario(Usuario usuario) throws Exception {
		try {
			UsuarioOutputDTO usuarioOutputDTO = UsuarioMapperOutput.INSTANCE.usuarioToUsuarioOutputDTO(usuario);
			if(usuarioRepository.existsById(usuario.getId()))
				usuarioRepository.delete(usuarioOutputDTO);
			else
				throw new ArquivoNotFoudException("404", "usuario nao encontrado");

		} catch (HibernateException exception) {
			throw new BusinessException("500", "erro inesperado");
		}
	}
}
