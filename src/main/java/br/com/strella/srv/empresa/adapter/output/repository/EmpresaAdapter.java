package br.com.strella.srv.empresa.adapter.output.repository;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.adapter.output.repository.dto.mapper.EmpresaMapperOutput;
import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;

public class EmpresaAdapter implements IEmpresaPort {

	private final EmpresaRepository empresaRepository;

	public EmpresaAdapter(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}

	@Override
	public Empresa cadastraArquivo(Empresa empresa) {

		EmpresaOutputDTO empresaOutputDTO = EmpresaMapperOutput.INSTANCE
			.transitoriaContabilToTransitoriaContabilOutputDTO(empresa);

		empresaRepository.save(empresaOutputDTO);

		return EmpresaMapperOutput.INSTANCE
			.TransitoriaContabilOutputDTOToTransitoriaContabil(empresaOutputDTO) ;
	}
}
