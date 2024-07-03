package com.cvortex.live.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SituacaoPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Boolean bloqueiaEntregaDeDemandas;

    // Getters e Setters
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

    public Boolean getBloqueiaEntregaDeDemandas() {
        return bloqueiaEntregaDeDemandas;
    }

    public void setBloqueiaEntregaDeDemandas(Boolean bloqueiaEntregaDeDemandas) {
        this.bloqueiaEntregaDeDemandas = bloqueiaEntregaDeDemandas;
    }
}
