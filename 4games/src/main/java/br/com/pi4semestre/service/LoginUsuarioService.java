package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.repository.LoginUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUsuarioService {


    @Autowired
    private LoginUsuarioRepository loginUsuarioRepository;

    public Usuario validateUsuarioLogin(Usuario usuario){
        return loginUsuarioRepository.logar((usuario.getEmail()), usuario.getSenha());
    }
}
