package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository <Colaborador, Integer>{

    @Query("SELECT c FROM Colaborador c WHERE c.nome LIKE :nome")
        Colaborador buscarPorNome(@Param("nome") String nome);

    @Modifying
    @Query("UPDATE Colaborador c SET c.nome = :nome, c.senha = :senha, c.cpf = :cpf WHERE c.email = :email ")
    void alterarColaborador(@Param("nome") String nome, @Param("senha") String senha, @Param("cpf") long cpf,
                                   @Param("email") String email);
}
