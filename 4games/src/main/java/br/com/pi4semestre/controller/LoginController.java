package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colaborador")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Colaborador colaborador){
        String email = colaborador.getEmail();
        String senha = colaborador.getSenha();

        boolean validado = loginService.validateLogin(email,senha);
        System.out.println(email);
        System.out.println(senha);
        if(validado){
            return ResponseEntity.ok().build();

        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha inválidos");
        }
    }
}
