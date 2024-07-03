package com.cvortex.live.model;

import jakarta.persistence.*;


@Entity
public class Demanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private Pessoa pessoa;

    private Integer agendadoParaPessoa;

    @ManyToOne
    @JoinColumn(name = "id_unidade_de_negocio", referencedColumnName = "id")
    private UnidadeDeNegocio unidadeDeNegocio;

    private boolean fechada;

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getAgendadoParaPessoa() {
        return agendadoParaPessoa;
    }

    public void setAgendadoParaPessoa(Integer agendadoParaPessoa) {
        this.agendadoParaPessoa = agendadoParaPessoa;
    }

    public UnidadeDeNegocio getUnidadeDeNegocio() {
        return unidadeDeNegocio;
    }

    public void setUnidadeDeNegocio(UnidadeDeNegocio unidadeDeNegocio) {
        this.unidadeDeNegocio = unidadeDeNegocio;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }
}

