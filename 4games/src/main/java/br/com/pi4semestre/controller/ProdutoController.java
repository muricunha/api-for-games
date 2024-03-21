package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Produto;
import br.com.pi4semestre.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {


    public final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/salvar")
    public void salvarProduto(@RequestBody Produto produto) {
        produtoService.salvarProduto(produto);
    }

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Produto>> listarProdutos() {

        List<Produto> produtos = produtoService.listarProdutos();
        if (!produtos.isEmpty()) {
            return ResponseEntity.ok(produtos);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/alterar")
    public void alterarProduto(@RequestBody Produto produto) {
        produtoService.alterarProduto(produto);
    }

    @DeleteMapping("/deletar")
    public void deletarProduto(@RequestBody Produto produto) {
        produtoService.deletarUsuario(produto);
    }
}
