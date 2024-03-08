package br.com.strella.srv.empresa.adapter.output.repository.dto.mapper;

import br.com.strella.srv.empresa.adapter.output.repository.dto.ProfissionalOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.specification.ProfissionalSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.specification.UsuarioSpecification;
import br.com.strella.srv.empresa.domain.entity.Profissional;
import br.com.strella.srv.empresa.domain.entity.Usuario;
import java.util.List;
import org.mapstruct.factory.Mappers;

public interface ProfissionalMapperOutput {
	ProfissionalMapperOutput INSTANCE = Mappers.getMapper(ProfissionalMapperOutput.class);

	ProfissionalOutputDTO profissionalToProfissionalOutputDTO(Profissional profissional);
	Profissional profissionalOutputDTOToProfissional(ProfissionalOutputDTO profissionalOutputDTO);
	ProfissionalSpecification profissionalToProfissionalEspecification(Profissional profissionalOutputDTO);
	List<Usuario> listProfissionalOutputDTOToProfissional(List<ProfissionalOutputDTO> profissionalList);
}
