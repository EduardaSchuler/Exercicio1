package com.exercicio1.Exercicio1.DAO.Model;

import java.text.DateFormat;

public class UserModel {
    private int id;
    private String nome;
    private DateFormat dataNascimento;
    private int numDependentes;

    public UserModel (int id, String nome, DateFormat dataNascimento, int numDependentes){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numDependentes = numDependentes;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public DateFormat getDataNascimento() {
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
