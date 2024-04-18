package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.CadastroCliente;
import br.com.pi4semestre.repository.ClienteRepository;
import br.com.pi4semestre.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    @PostMapping("/salvar")
    public void salvarCliente(@RequestBody CadastroCliente cliente){
        clienteService.salvarCliente(cliente);
    }
}
