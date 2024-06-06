package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    public final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/salvar")
    public void salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
    }

    @PutMapping("/alterar")
    public void alterarUsuario(@RequestBody Usuario usuario) {
        usuarioService.alterarUsuario(usuario);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Usuario obterUsuarioPorId(@PathVariable("id") int id) {
        return usuarioService.obterUsuarioPorId(id);
    }

    @DeleteMapping("/deletar")
    public void deletarUsuario(@RequestBody Usuario usuario) {
        usuarioService.deletarUsuario(usuario);
    }
}
