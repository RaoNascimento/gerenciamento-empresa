package br.com.strella.srv.empresa.adapter.dto.mapper;

import br.com.strella.srv.empresa.adapter.input.rest.dto.EmpresaInputDTO;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpresaMapper {

	EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

	EmpresaInputDTO transitoriaContabilToTransitoriaContabilInputDTO(Empresa empresa);
	Empresa TransitoriaContabilInputDTOToTransitorioContabil(EmpresaInputDTO empresaInputDTO);


}
class CustomConverter {

}
