package br.com.mvc.mudi;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.mvc.mudi.interceptor.InterceptadorDeAcesso;

public class WebConfig extends WebMvcConfigurationSupport{

	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new InterceptadorDeAcesso()).addPathPatterns("/**");
	}
}
