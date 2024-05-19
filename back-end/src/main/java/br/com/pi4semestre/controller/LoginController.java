package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Colaborador;
import br.com.pi4semestre.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaborador")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<Colaborador> login(@RequestBody Colaborador colaborador){
        Colaborador colaboradorLogado = loginService.validateLogin(colaborador);

        if (colaboradorLogado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(colaboradorLogado);
    }
}
