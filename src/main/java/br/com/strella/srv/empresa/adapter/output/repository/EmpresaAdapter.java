package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.EmpresaMapperOutput;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.springframework.data.domain.Pageable;

public class EmpresaAdapter implements IEmpresaPort {
	private final EmpresaRepository empresaRepository;
	private EmpresaSpecification empresaSpecification;

	public EmpresaAdapter(EmpresaRepository empresaRepository, EmpresaSpecification empresaSpecification) {
		this.empresaRepository = empresaRepository;
		this.empresaSpecification = empresaSpecification;
	}

	@Override
	public Empresa cadastrarEmpresa(Empresa empresa) {
		EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE.empresaToEmpresaOutputDTO(empresa);
		empresaRepository.save(empresaOutputDTO);

		return EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresa(empresaOutputDTO) ;
	}

	@Override
	public Empresa editarEmpresa(Empresa empresa) {
		EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE.empresaToEmpresaOutputDTO(empresa);

		return EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresa(empresaRepository.save(empresaOutputDTO));
	}

	@Override
	public List<Empresa> listarEmpresas(Empresa filtrosSelecionados, Pageable pageable) {
		this.empresaSpecification = EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresaEspecification(filtrosSelecionados);
		var lista = empresaRepository.findAll(this.empresaSpecification, pageable).toList();

		return  EmpresaMapperOutput.INSTANCE.listEmpresaOutputDTOToEmpresa(lista);
	}

	@Override
	public void deletarEmpresa(Empresa empresa) throws Exception {
		try {
			EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE.empresaToEmpresaOutputDTO(empresa);
			empresaRepository.delete(empresaOutputDTO);
		} catch (HibernateException exception) {
			throw new Exception();
		}


	}


}
