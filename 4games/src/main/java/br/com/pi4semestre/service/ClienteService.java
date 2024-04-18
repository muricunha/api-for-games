package br.com.pi4semestre.service;

import br.com.pi4semestre.model.CadastroCliente;
import br.com.pi4semestre.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;


    public void salvarCliente(CadastroCliente cliente) {
        this.clienteRepository.save(cliente);
    }
}
