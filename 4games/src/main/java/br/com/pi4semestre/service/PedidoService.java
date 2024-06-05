package br.com.pi4semestre.service;

import br.com.pi4semestre.model.Pedido;
import br.com.pi4semestre.model.Usuario;
import br.com.pi4semestre.repository.PedidoRepository;
import br.com.pi4semestre.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Transactional
    public void salvarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Transactional
    public void alterarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos(int id) {
        return pedidoRepository.listarPedidosPorUsuario(id);
    }

    public List<Pedido> listarPedidosPorNome(String nome){
        return pedidoRepository.listarPedidosPorUsuarioPorNome(nome);
    }

    @Transactional
    public void alterarStatusPedido(@RequestBody Pedido pedido) {
        pedidoRepository.alterarStatusPedido(pedido.getStatusPedido(), pedido.getNumeroPedidoKey());
    }
}
