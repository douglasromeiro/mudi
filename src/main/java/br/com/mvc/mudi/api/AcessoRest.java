package br.com.mvc.mudi.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mvc.mudi.interceptor.InterceptadorDeAcesso;
import br.com.mvc.mudi.interceptor.InterceptadorDeAcesso.Acesso;

@RestController
@RequestMapping("acessos")
public class AcessoRest {

	@GetMapping
	public List<Acesso> getAcessos() {
		
		return InterceptadorDeAcesso.acessos;
	}
}
