package br.com.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvc.mudi.DTO.RequisicaoNovoPedido;
import br.com.mvc.mudi.model.Pedido;
import br.com.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRespository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao,
			BindingResult result) {

		if (result.hasErrors()) {
			return "pedido/formulario";
		}

		Pedido pedido = requisicao.toPedido();
		pedidoRespository.save(pedido);
		return "redirect:/home";

	}

}
