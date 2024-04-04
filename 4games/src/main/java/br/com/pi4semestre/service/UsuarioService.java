package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {

    public final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarUsuario(Usuario usuario){this.usuarioRepository.save(usuario);}

    @Transactional
    public void alterarUsuario(Usuario usuario){usuarioRepository.save(usuario);}

    public void deletarUsuario(@RequestBody Usuario usuario){usuarioRepository.delete(usuario);}
}
