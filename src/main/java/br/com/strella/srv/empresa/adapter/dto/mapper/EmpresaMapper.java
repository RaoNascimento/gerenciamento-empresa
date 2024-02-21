package br.com.strella.srv.empresa.adapter.dto.mapper;

import br.com.strella.srv.empresa.adapter.input.rest.dto.EmpresaInputDTO;
import br.com.strella.srv.empresa.adapter.input.rest.dto.RootEmpresaDTO;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpresaMapper {

	EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

	EmpresaInputDTO empresaToEmpresaInputDTO(Empresa empresa);
	Empresa empresaInputDTOToEmpresa(EmpresaInputDTO empresaInputDTO);
	List<EmpresaInputDTO> listEmpresaToEmpresaInputDTO(List<Empresa> empresa);


}
class CustomConverter {

}
