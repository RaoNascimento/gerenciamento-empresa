package br.com.strella.srv.empresa.adapter.output.repository.dto.mapper;

import br.com.strella.srv.empresa.adapter.output.repository.UsuarioSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.dto.UsuarioOutputDTO;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UsuarioMapperOutput {

	UsuarioMapperOutput INSTANCE = Mappers.getMapper(UsuarioMapperOutput.class);

	UsuarioOutputDTO usuarioToUsuarioOutputDTO(Usuario usuario);
	Usuario usuarioOutputDTOToUsuario(UsuarioOutputDTO usuarioOutputDTO);
	UsuarioSpecification usuarioOutputDTOToUsuarioEspecification(Usuario usuarioOutputDTO);
	List<Usuario> listUsuarioOutputDTOToUsuario(List<UsuarioOutputDTO> usuarioList);
}
