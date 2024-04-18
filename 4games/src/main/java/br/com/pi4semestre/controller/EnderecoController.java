package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Endereco;
import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.service.EnderecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping("/salvar")
    public void salvarEndereco(Endereco endereco){enderecoService.enderecoSalvar(endereco);}

    @ResponseBody
    @GetMapping("/listar")
    public ResponseEntity<List<Endereco>>  listarEndereco(@RequestBody Usuario usuario){

        List<Endereco> enderecos = enderecoService.listarEndereco(usuario);

        if (enderecos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enderecos);
    }

    @DeleteMapping("/deletar")
    public void deletarEndereco(Endereco endereco){enderecoService.excluirEndereco(endereco);}

    @PostMapping("/alterar")
    public void alterarEndereco(@RequestBody Endereco endereco){enderecoService.alterarEndereco(endereco);}
}
