package br.com.strella.srv.empresa.adapter.output;

import br.com.strella.srv.empresa.adapter.output.repository.EmpresaRepository;
import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.EmpresaMapperOutput;
import br.com.strella.srv.empresa.adapter.output.repository.specification.EmpresaSpecification;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.domain.exception.ArquivoNotFoudException;
import br.com.strella.srv.empresa.domain.exception.BusinessException;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

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
		empresaRepository.saveAndFlush(empresaOutputDTO);

		return EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresa(empresaOutputDTO) ;
	}

	@Override
	@Transactional
	public Empresa editarEmpresa(Empresa empresa) {
		EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE.empresaToEmpresaOutputDTO(empresa);

		return EmpresaMapperOutput.INSTANCE.empresaOutputDTOToEmpresa(empresaRepository.saveAndFlush(empresaOutputDTO));
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
			if(empresaRepository.existsById(empresa.getId()))
				empresaRepository.delete(empresaOutputDTO);
			else
				throw new ArquivoNotFoudException("404", "empresa nao encontrada");

		} catch (HibernateException exception) {
			throw new BusinessException("500", "erro inesperado");
		}
	}
}
