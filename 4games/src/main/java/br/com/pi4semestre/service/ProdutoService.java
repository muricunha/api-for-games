package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Produto;
import br.com.pi4semestre.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProdutoService {

    public final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    public void salvarProduto(Produto produto) {
        this.produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Transactional
    public void alterarProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    public void deletarUsuario(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

}
