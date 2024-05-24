package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.service.LoginUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class LoginUsuarioController {

    @Autowired
    private LoginUsuarioService loginUsuarioService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
        Usuario usuarioLogado = loginUsuarioService.validateUsuarioLogin(usuario);

        if(usuarioLogado == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarioLogado);
    }
}
