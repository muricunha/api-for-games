package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<CadastroCliente, Integer> {
}
