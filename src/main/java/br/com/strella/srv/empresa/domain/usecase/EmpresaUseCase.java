package br.com.strella.srv.empresa.domain.usecase;

import br.com.strella.srv.empresa.domain.entity.Empresa;
import br.com.strella.srv.empresa.port.input.IEmpresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.springframework.data.domain.Pageable;

public class EmpresaUseCase implements IEmpresa {

	private final IEmpresaPort empresaAdapter;
	public EmpresaUseCase(IEmpresaPort empresaAdapter) {
		this.empresaAdapter = empresaAdapter;
	}

	@Override
	public Empresa cadastrarEmpresa(Empresa empresa) {
		empresa.setDataAtualizacao(LocalDate.now());

		return empresaAdapter.cadastrarEmpresa(empresa);

	}
	public Empresa editarEmpresa(Empresa empresa){
		return empresaAdapter.editarEmpresa(empresa);
	}
	@Override
	public List<Empresa> listarEmpresasViaFiltro(Long id, Long idLogo, String urlAcesso, Long idPlanoEmpresa, Pageable pageable){
		Empresa filtrosSelecionados = new Empresa(
			Objects.isNull(id) ? null : id,
			Objects.isNull(urlAcesso) ? null : urlAcesso,
			Objects.isNull(idPlanoEmpresa) ? null : idPlanoEmpresa,
			Objects.isNull(idLogo) ? null : idLogo);

		return this.empresaAdapter.listarEmpresas(filtrosSelecionados, pageable);
	}

	@Override
	public void deletarEmpresa(Long id) {
		Empresa empresa = new Empresa();
		empresa.setId(id);
		try {
			empresaAdapter.deletarEmpresa(empresa);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
