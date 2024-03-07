package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository <Colaborador, Integer>{
}
