package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE CONCAT('%', :nomeProduto, '%') ")
    List<Produto> listarProdutosPorNome(@Param("nomeProduto") String nomeProduto);
}
