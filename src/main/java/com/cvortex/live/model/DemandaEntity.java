package com.cvortex.live.model;


import jakarta.persistence.*;

@Entity
@Table(name="demanda")
public class DemandaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="id_pessoa", referencedColumnName = "id")
    private PessoaEntity pessoa;


    @ManyToOne
    @JoinColumn(name="agendado_para_pessoa", referencedColumnName = "id")
    private PessoaEntity agendadoParaPessoa;

    private boolean fechada;

    @ManyToOne
    @JoinColumn(name="id_unidade_de_negocio", referencedColumnName = "id")
    private  UnidadeDeNegocioEntity unidadeDeNegocio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaEntity getAgendadoParaPessoa() {
        return agendadoParaPessoa;
    }

    public void setAgendadoParaPessoa(PessoaEntity agendadoParaPessoa) {
        this.agendadoParaPessoa = agendadoParaPessoa;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }

    public UnidadeDeNegocioEntity getUnidadeDeNegocio() {
        return unidadeDeNegocio;
    }

    public void setUnidadeDeNegocio(UnidadeDeNegocioEntity unidadeDeNegocio) {
        this.unidadeDeNegocio = unidadeDeNegocio;
    }
}
