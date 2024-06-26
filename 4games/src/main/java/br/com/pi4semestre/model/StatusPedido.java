package br.com.pi4semestre.model;

public enum StatusPedido {

    AGUARDANDO_APROVACAO("Aguardando Aprovação"),
    EM_ANDAMENTO("Em Andamento"),
    CONCLUIDO("Concluído");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }
}
