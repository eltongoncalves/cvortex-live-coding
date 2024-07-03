package com.cvortex.live.model;


import jakarta.persistence.*;

@Entity
@Table(name="pessoa")
public class PessoaEntity {

    @Id
    private int id;

    private String nome;

    @ManyToOne
    @JoinColumn(name="id_situacao_pessoa", referencedColumnName = "id")
    private SituacaoPessoaEntity situacaoPessoa;

    @ManyToOne
    @JoinColumn(name="id_unidade_de_negocio", referencedColumnName = "id")
    private  UnidadeDeNegocioEntity unidadeDeNegocio;

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

    public SituacaoPessoaEntity getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(SituacaoPessoaEntity situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }

    public UnidadeDeNegocioEntity getUnidadeDeNegocio() {
        return unidadeDeNegocio;
    }

    public void setUnidadeDeNegocio(UnidadeDeNegocioEntity unidadeDeNegocio) {
        this.unidadeDeNegocio = unidadeDeNegocio;
    }
}
