package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Cartao;
import br.com.pi4semestre.repository.CartaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CartaoService {
    private final CartaoRepository cartaoRepository;

    public CartaoService(CartaoRepository cartaoRepository) {
        this.cartaoRepository = cartaoRepository;
    }

    public void salvarCartao(Cartao cartao){
        cartaoRepository.save(cartao);
    }
    @Transactional
    public void alterarCartao(@RequestBody Cartao cartao){
        cartaoRepository.save(cartao);
    }
    public void deletarCartao(@RequestBody Cartao cartao){
        cartaoRepository.save(cartao);
    }
}
