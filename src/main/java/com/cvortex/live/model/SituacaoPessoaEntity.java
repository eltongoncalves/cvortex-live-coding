package com.cvortex.live.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "situacao_pessoa")
public class SituacaoPessoaEntity {

    @Id
    private int  id;

    private String nome;

    private  Boolean bloqueiaEntregaDeDemandas;

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
