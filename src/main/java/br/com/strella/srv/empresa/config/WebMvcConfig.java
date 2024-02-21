package br.com.strella.srv.empresa.config;

import br.com.strella.srv.empresa.adapter.output.repository.EmpresaAdapter;
import br.com.strella.srv.empresa.adapter.output.repository.EmpresaRepository;
import br.com.strella.srv.empresa.adapter.output.repository.EmpresaSpecification;
import br.com.strella.srv.empresa.domain.usecase.EmpresaUseCase;
import br.com.strella.srv.empresa.port.input.IEmpresa;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

@Bean("IEmpresaPort")
@ApplicationScope
IEmpresaPort getEmpresaAdapter(EmpresaRepository empresaRepository, EmpresaSpecification empresaSpecification){
		return new EmpresaAdapter(empresaRepository, empresaSpecification);
	}
@Bean("IEmpresa")
	@ApplicationScope
IEmpresa getEmpresaUseCase(IEmpresaPort empresaAdapter){
	return new EmpresaUseCase(empresaAdapter);
}

}
