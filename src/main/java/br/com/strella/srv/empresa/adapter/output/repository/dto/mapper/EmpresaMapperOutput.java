package br.com.strella.srv.empresa.adapter.output.repository.dto.mapper;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EmpresaMapperOutput {
	EmpresaMapperOutput INSTANCE = Mappers.getMapper(EmpresaMapperOutput.class);

	EmpresaOutputDTO transitoriaContabilToTransitoriaContabilOutputDTO(Empresa empresa);
	Empresa TransitoriaContabilOutputDTOToTransitoriaContabil(EmpresaOutputDTO empresaOutputDTO);
}
