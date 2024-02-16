package br.com.strella.srv.empresa.domain.usecase;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TajePersistenceUseCaseTest {

//	private ITajePersistencePort tajePersistenceAdapter;
//	private ILogServicoCanalPort logServicoCanal;
//	private ITajePersistence tajePersistenceUseCase;
//
//	private ArgumentCaptor<TransitoriaContabil> TransitoriaContabilCaptor;
//
//	@BeforeEach
//	void setup() {
//		tajePersistenceAdapter = mock(ITajePersistencePort.class);
//		logServicoCanal = mock(ILogServicoCanalPort.class);
//		tajePersistenceUseCase = new EmpresaUseCase(tajePersistenceAdapter);
//	}
//
//	@Test
//	void devePersistirDadosComSucesso() throws Exception {
//		var transitoriaContabil = TajePersistenceFactory.getDadosTaje();
//
//		when(tajePersistenceAdapter.cadastraArquivo(any(TransitoriaContabil.class))).thenReturn(transitoriaContabil);
//		var resultado = tajePersistenceUseCase.cadastraArquivoTaje(transitoriaContabil);
//
//		verify(tajePersistenceAdapter, times(1)).cadastraArquivo(any(TransitoriaContabil.class));
//		assertEquals(transitoriaContabil.getId(), resultado.getId());
//		assertEquals(transitoriaContabil.getNome(), resultado.getNome());
//	}


}


