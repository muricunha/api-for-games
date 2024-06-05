package br.com.pi4semestre.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
      private int codigoProduto;

    @Column(unique = true)
      private String nome;
      private double avaliacao;

      private String descricao;

      private double preco;

      private int qtdEstoque;
      @OneToMany(cascade = CascadeType.ALL)
      private List<CaminhoImagem> caminhoImagem;


    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<CaminhoImagem> getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(List<CaminhoImagem> caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
}
