package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.model.EnderecoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoCliente, Integer> {
}
