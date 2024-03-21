package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Colaborador, Integer> {
    @Query("SELECT c FROM Colaborador c WHERE c.email = ?1 AND c.senha = ?2")
    Colaborador loginByUser(String email, String senha);
}
