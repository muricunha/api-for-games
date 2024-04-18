package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.CadastroCliente;
import br.com.pi4semestre.model.EnderecoCliente;
import br.com.pi4semestre.service.ClienteService;
import br.com.pi4semestre.service.EnderecoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    private EnderecoService enderecoService;
    @PostMapping("/salvar")
    public void salvarEndereco(@RequestBody EnderecoCliente endereco) {
        enderecoService.salvarEndereco(endereco);
    }
}
