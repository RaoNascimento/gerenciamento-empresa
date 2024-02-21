package br.com.strella.srv.empresa.adapter.output.repository.dto.mapper;

import br.com.strella.srv.empresa.adapter.output.repository.EmpresaSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EmpresaMapperOutput {
	EmpresaMapperOutput INSTANCE = Mappers.getMapper(EmpresaMapperOutput.class);

	EmpresaOutputDTO empresaToEmpresaOutputDTO(Empresa empresa);
	Empresa empresaOutputDTOToEmpresa(EmpresaOutputDTO empresaOutputDTO);
	EmpresaSpecification empresaOutputDTOToEmpresaEspecification(Empresa empresaOutputDTO);
	List<Empresa> listEmpresaOutputDTOToEmpresa(List<EmpresaOutputDTO> empresaList);
}
