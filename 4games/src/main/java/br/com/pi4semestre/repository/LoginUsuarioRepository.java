package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("SELECT u FROM Usuario u WHERE u.email = ?1 AND u.senha = ?2")
    Usuario logar(String email, String senha);
}
