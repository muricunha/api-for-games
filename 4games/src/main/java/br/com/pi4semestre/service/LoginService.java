package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Colaborador validateLogin(Colaborador colaborador){
        return loginRepository.logar(colaborador.getEmail(), colaborador.getSenha());
    }
}
