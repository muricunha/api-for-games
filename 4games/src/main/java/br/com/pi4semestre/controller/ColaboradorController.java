package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.service.ColaboradorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @PostMapping("/salvar")
    public void salvarColaborador(@RequestBody Colaborador colaborador){colaboradorService.salvarColaborador(colaborador);}

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Colaborador>> listarColaborador() {

        List<Colaborador> produtos = colaboradorService.listarColaborador();
        if (!produtos.isEmpty()) {
            return ResponseEntity.ok(produtos);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletar")
    public void deletarColaborador(Colaborador colaboador){
            colaboradorService.deletaColaborador(colaboador);

        }

     @PutMapping("/alterar")
    public void alterarColaborador(Colaborador colaboador){
            colaboradorService.alterarColaborador(colaboador);
        }
    }

    