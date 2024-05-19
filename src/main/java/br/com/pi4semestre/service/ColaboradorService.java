package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.repository.ColaboradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@Service
public class ColaboradorService {

   private final ColaboradorRepository colaboradorRepository;


    public ColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    public void salvarColaborador(Colaborador colaborador){this.colaboradorRepository.save(colaborador);}

    public List<Colaborador> listarColaborador(){return colaboradorRepository.findAll();}

    public List<Colaborador> listarColaboradorPorNome(Colaborador colaborador){
        return colaboradorRepository.listarColaboradorPorNome(colaborador.getNome());
    }

    @Transactional
    public void alterarColaborador(Colaborador colaborador) {
        colaboradorRepository.save(colaborador);
    }

    public void deletaColaborador(@RequestBody Colaborador colaborador) {
        colaboradorRepository.delete(colaborador);
    }
}
