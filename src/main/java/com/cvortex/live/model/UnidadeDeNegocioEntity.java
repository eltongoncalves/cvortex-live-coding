package com.cvortex.live.model;


import jakarta.persistence.*;

@Entity
@Table(name="unidade_de_negocio")
public class UnidadeDeNegocioEntity {

    @Id
    private int id;
    private String nome;


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
}
