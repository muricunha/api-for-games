package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean validateLogin(String email, String senha){
        Colaborador colaborador = loginRepository.loginByUser(email, senha);
        return colaborador != null;
    }
}
