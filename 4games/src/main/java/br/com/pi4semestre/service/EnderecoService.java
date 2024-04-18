package br.com.pi4semestre.service;

import br.com.pi4semestre.model.EnderecoCliente;
import br.com.pi4semestre.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;

    public void salvarEndereco(EnderecoCliente cliente) {
        this.enderecoRepository.save(cliente);
    }

}
