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
}
