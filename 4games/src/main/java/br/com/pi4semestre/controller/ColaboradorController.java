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
    public void salvarColaborador(@RequestBody Colaborador colaborador) {
        colaboradorService.salvarColaborador(colaborador);
    }

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Colaborador>> listarColaborador() {
        List<Colaborador> produtos = colaboradorService.listarColaborador();

        if (produtos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produtos);
    }

    @PostMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Colaborador>> listarColaboradorPorNome(@RequestBody Colaborador colaborador) {
        List<Colaborador> produtos = colaboradorService.listarColaboradorPorNome(colaborador);

        if (produtos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("/deletar")
    public void deletarColaborador(Colaborador colaboador) {
        colaboradorService.deletaColaborador(colaboador);

    }

    @PostMapping("/alterar")
    public void alterarColaborador(@RequestBody Colaborador colaboador) {
        colaboradorService.alterarColaborador(colaboador);
    }
}

    