package br.com.strella.srv.empresa.adapter.output.repository;


import static org.mockito.Mockito.mock;

import br.com.strella.srv.empresa.adapter.output.repository.dto.EmpresaOutputDTO;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class EmpresaAdapterTest {

private EmpresaRepository empresaRepository;
private IEmpresaPort empresaAdapter;

//	@Captor
//	private ArgumentCaptor<EmpresaOutputDTO> tajePersistenceDtoCaptor;
//	@BeforeEach
//	void setup() {
//		empresaRepository = mock(EmpresaRepository.class);
//		empresaAdapter = new EmpresaAdapter(empresaRepository);
//	}
//	@Test
//	void cadastrarDadosComSucesso() throws Exception {

//		var empresa = TajePersistenceFactory.getDadosTajeAdapter();
//		var transitoriaContabilDto = EmpresaMapperOutput.INSTANCE
//			.transitoriaContabilToTransitoriaContabilOutputDTO(empresa);
//
//		when(empresaRepository.save(any(EmpresaOutputDTO.class))).thenReturn(transitoriaContabilDto);
//
//		var resultado = empresaAdapter.cadastraArquivo(empresa);
//
//		verify((empresaRepository), times(1)).save(any(EmpresaOutputDTO.class));
//		assertNotNull(resultado);
		//assertEquals(empresa.getId(), resultado.getId());

	//}
}
