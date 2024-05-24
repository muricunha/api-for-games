package br.com.pi4semestre.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroPedidoKey;
    @OneToOne(cascade = CascadeType.MERGE)
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.MERGE)
    private Endereco enderecoEntrega;
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Produto> produtos;
    @OneToOne
    private FormaPagamento formaPagamento;
    private LocalDate dataCompra;
    private BigDecimal valorTotal;
    @Enumerated
    private StatusPedido statusPedido;
    public int getNumeroPedidoKey() {
        return numeroPedidoKey;
    }

    public void setNumeroPedidoKey(int numeroPedidoKey) {
        this.numeroPedidoKey = numeroPedidoKey;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
