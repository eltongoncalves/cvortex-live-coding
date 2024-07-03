package com.cvortex.live.model;


import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_situacao_pessoa", referencedColumnName = "id")
    private SituacaoPessoa situacaoPessoa;

    @ManyToOne
    @JoinColumn(name = "id_unidade_de_negocio", referencedColumnName = "id")
    private UnidadeDeNegocio unidadeDeNegocio;

    private String nome;

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SituacaoPessoa getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(SituacaoPessoa situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }

    public UnidadeDeNegocio getUnidadeDeNegocio() {
        return unidadeDeNegocio;
    }

    public void setUnidadeDeNegocio(UnidadeDeNegocio unidadeDeNegocio) {
        this.unidadeDeNegocio = unidadeDeNegocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
