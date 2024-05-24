package br.com.pi4semestre.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private List<Cartao> cartaoList = new ArrayList<>();

}
