package br.com.pi4semestre.model;

import jakarta.persistence.*;

@Entity
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String senha;

    private int CPF;

    @Column(unique = true )
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCPF() {return CPF;}

    public void setCPF(int CPF) {this.CPF = CPF;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
