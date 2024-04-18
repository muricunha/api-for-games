package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.id = :id")
    List<Endereco> buscarPorEnderecoPorUsuario(@Param("id") int id);
}