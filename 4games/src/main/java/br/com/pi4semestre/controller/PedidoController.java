package br.com.pi4semestre.controller;

import br.com.pi4semestre.model.DTO.ListaPedidoPorNomeForm;
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


    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Pedido>> listarPedidosPorUsuario(@RequestBody Pedido pedido){
        List<Pedido> pedidos = pedidoService.listarPedidos(pedido.getUsuario().getId());

        if(pedidos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidos);
    }


    @PostMapping ("/listarPorNome")
    @ResponseBody
    public ResponseEntity<List<Pedido>> listarPedidosPorUsuarioPorNome(@RequestBody ListaPedidoPorNomeForm form){
        List<Pedido> pedidos = pedidoService.listarPedidosPorNome(form.getNome());

        if(pedidos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidos);
    }
    @PatchMapping ("/cancelar")
    public void alterarStatusPedido(Pedido pedido){pedidoService.alterarStatusPedido(pedido);}
}
