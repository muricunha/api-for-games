package br.com.pi4semestre.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private long cpf;

}
