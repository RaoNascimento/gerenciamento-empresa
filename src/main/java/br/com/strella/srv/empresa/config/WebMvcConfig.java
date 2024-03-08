package br.com.strella.srv.empresa.config;

import br.com.strella.srv.empresa.adapter.output.EmpresaAdapter;
import br.com.strella.srv.empresa.adapter.output.ProfissionalAdapter;
import br.com.strella.srv.empresa.adapter.output.UsuarioAdapter;
import br.com.strella.srv.empresa.adapter.output.repository.EmpresaRepository;

import br.com.strella.srv.empresa.adapter.output.repository.ProfissionalRepository;
import br.com.strella.srv.empresa.adapter.output.repository.UsuarioRepository;

import br.com.strella.srv.empresa.adapter.output.repository.specification.EmpresaSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.specification.ProfissionalSpecification;
import br.com.strella.srv.empresa.adapter.output.repository.specification.UsuarioSpecification;
import br.com.strella.srv.empresa.domain.usecase.EmpresaUseCase;
import br.com.strella.srv.empresa.domain.usecase.ProfissionalUseCase;
import br.com.strella.srv.empresa.domain.usecase.UsuarioUseCase;
import br.com.strella.srv.empresa.port.input.IEmpresa;
import br.com.strella.srv.empresa.port.input.IProfissional;
import br.com.strella.srv.empresa.port.input.IUsuario;
import br.com.strella.srv.empresa.port.output.IEmpresaPort;
import br.com.strella.srv.empresa.port.output.IProfissionalPort;
import br.com.strella.srv.empresa.port.output.IUsuarioPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Bean("IEmpresa")
	@ApplicationScope
	IEmpresa getEmpresaUseCase(IEmpresaPort empresaAdapter) {
		return new EmpresaUseCase(empresaAdapter);
	}

	@Bean("IEmpresaPort")
	@ApplicationScope
	IEmpresaPort getEmpresaAdapter(EmpresaRepository empresaRepository, EmpresaSpecification empresaSpecification) {
		return new EmpresaAdapter(empresaRepository, empresaSpecification);
	}

	@Bean("IUsuario")
	@ApplicationScope
	IUsuario getUsuarioUseCase(IUsuarioPort usuarioAdapter) {
		return new UsuarioUseCase(usuarioAdapter);
	}

	@Bean("IUsuarioPort")
	@ApplicationScope
	IUsuarioPort getUsuarioAdapter(UsuarioRepository usuarioRepository, UsuarioSpecification usuarioSpecification) {
		return new UsuarioAdapter(usuarioRepository, usuarioSpecification);
	}

	@Bean("IProfissional")
	@ApplicationScope
	IProfissional getProfissionalUseCase(IProfissionalPort profissionalAdapter) {
		return new ProfissionalUseCase(profissionalAdapter);
	}
	@Bean("IProfissionalPort")
	@ApplicationScope
	IProfissionalPort getProfissionalAdapter(ProfissionalRepository profissionalRepository, ProfissionalSpecification profissionalSpecification) {
		return new ProfissionalAdapter(profissionalRepository, profissionalSpecification);
	}

}
