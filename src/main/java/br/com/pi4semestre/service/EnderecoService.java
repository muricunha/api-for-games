package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Endereco;
import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.repository.EnderecoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;


    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void enderecoSalvar(Endereco endereco){enderecoRepository.save(endereco);}

    public List<Endereco> listarEndereco(Usuario usuario){return enderecoRepository.buscarPorEnderecoPorUsuario(usuario.getId());}

    @Transactional
    public void alterarEndereco(Endereco endereco){enderecoRepository.save(endereco);}

    public void excluirEndereco(@RequestBody Endereco endereco){enderecoRepository.delete(endereco);}
}
