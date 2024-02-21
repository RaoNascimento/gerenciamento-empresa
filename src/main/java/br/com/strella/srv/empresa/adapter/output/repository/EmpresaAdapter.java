package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.EmpresaMapperOutput;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class EmpresaAdapter implements IEmpresaPort {

	private final EmpresaRepository empresaRepository;
	private EmpresaSpecification empresaSpecification;

	public EmpresaAdapter(EmpresaRepository empresaRepository, EmpresaSpecification empresaSpecification) {

		this.empresaRepository = empresaRepository;
		this.empresaSpecification = empresaSpecification;
	}

	@Override
	public Empresa cadastraArquivo(Empresa empresa) {

		EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE.empresaToEmpresaOutputDTO(empresa);
		empresaRepository.save(empresaOutputDTO);

		return EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresa(empresaOutputDTO) ;
	}

	@Override
	public List<Empresa> listarEmpresas(Empresa filtrosSelecionados, Pageable pageable) {
		this.empresaSpecification = EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresaEspecification(filtrosSelecionados);
		var lista = empresaRepository.findAll(this.empresaSpecification, pageable).toList();

		return  EmpresaMapperOutput.INSTANCE.listEmpresaOutputDTOToEmpresa(lista);
	}
}
