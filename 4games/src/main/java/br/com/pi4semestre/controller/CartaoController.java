package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Cartao;
import br.com.pi4semestre.service.CartaoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cartao")
public class CartaoController {
    private final CartaoService cartaoService;

    public CartaoController(CartaoService cartaoService) {
        this.cartaoService = cartaoService;
    }

    @PostMapping("/salvar")
    public void salvarCartao(@RequestBody Cartao cartao) {
        cartaoService.salvarCartao(cartao);
    }

    @PostMapping("/alterar")
    public void alterarCartao(@RequestBody Cartao cartao) {
        cartaoService.alterarCartao(cartao);
    }
    @DeleteMapping("/delete")
    public void deletarCartao(@RequestBody Cartao cartao) {
        cartaoService.deletarCartao(cartao);
    }
}