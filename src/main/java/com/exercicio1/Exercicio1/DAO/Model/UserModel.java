package com.exercicio1.Exercicio1.DAO.Model;

import java.sql.Date;

public class UserModel {
    private String id;
    private String nome;
    private Date dataNascimento;
    private int numDependentes;

    public UserModel (String id, String nome, Date dataNascimento, int numDependentes){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numDependentes = numDependentes;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
}
