package br.com.strella.srv.empresa.adapter.dto.mapper;

import br.com.strella.srv.empresa.adapter.input.rest.dto.ProfissionalInputDTO;
import br.com.strella.srv.empresa.adapter.input.rest.dto.UsuarioInputDTO;
import br.com.strella.srv.empresa.domain.entity.Profissional;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ProfissionalMapper {
	ProfissionalMapper INSTANCE = Mappers.getMapper(ProfissionalMapper.class);

	Profissional profissionalInputDTOToProfissional(ProfissionalInputDTO profissionalInputDTO);

	ProfissionalInputDTO profissionalToProfissionalInputDTO(Profissional profissional);

	List<UsuarioInputDTO> listProfissionalToProfissionalInputDTO(List<Profissional> profissional);
}
