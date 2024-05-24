package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.Pedido;
import br.com.pi4semestre.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/salvar")
    public void salvarPedido(@RequestBody Pedido pedido){
        pedidoService.salvarPedido(pedido);
    }

    @PostMapping("/alterar")
    public void alterarPedido(@RequestBody Pedido pedido){
        pedidoService.salvarPedido(pedido);
    }

    @PostMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Pedido>> listarPedidosPorUsuario(@RequestBody Pedido pedido){
        List<Pedido> pedidos = pedidoService.listarPedidos(pedido.getUsuario().getId());

        if(pedidos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidos);
    }
    @PutMapping("/cancelar")
    public void cancelarPedido(Pedido pedido){pedidoService.cancelarPedido(pedido);}
}
