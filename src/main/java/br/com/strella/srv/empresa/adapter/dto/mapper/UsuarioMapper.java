package br.com.strella.srv.empresa.adapter.dto.mapper;

import br.com.strella.srv.empresa.adapter.input.rest.dto.UsuarioInputDTO;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

	Usuario usuarioInputDTOToUsuario(UsuarioInputDTO usuarioInputDTO);

	UsuarioInputDTO usuarioToUsuarioInputDTO(Usuario cadastrarUsuario);
}
