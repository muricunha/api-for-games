package br.com.pi4semestre.repository;

import br.com.pi4semestre.model.Pedido;
import br.com.pi4semestre.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    @Query("SELECT p FROM Pedido p WHERE CAST(p.usuario.id as string) LIKE CONCAT('%', :id, '%')")
    List<Pedido> listarPedidosPorUsuario(@Param("id") int id);

    @Query("SELECT p FROM Pedido p WHERE CAST(p.usuario.nome as string) LIKE CONCAT('%', :nome, '%')")
    List<Pedido> listarPedidosPorUsuarioPorNome(@Param("nome") String nome);

    @Modifying
    @Query("UPDATE Pedido p SET p.statusPedido = :statusPedido WHERE p.numeroPedidoKey = :numeroPedidoKey")
    void alterarStatusPedido(@Param("statusPedido") StatusPedido statusPedido, @Param("numeroPedidoKey") int numeroPedidoKey);
}
