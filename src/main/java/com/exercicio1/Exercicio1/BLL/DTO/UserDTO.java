package com.exercicio1.Exercicio1.BLL.DTO;

import java.text.DateFormat;

import com.exercicio1.Exercicio1.DAO.Model.UserModel;

public class UserDTO {

    private String id;
    private String nome;
    private DateFormat dataNascimento;
    private int numDependentes;

    public UserDTO (UserModel user){
        this.id = user.getId();
        this.nome = user.getNome();
        this.dataNascimento = user.getDataNascimento();
        this.numDependentes = user.getNumDependentes();
    }

    public String getId() {
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

    // O método fromModel é um método de fábrica estático (static factory method), ou seja, em vez de criar o DTO usando new AplicativoDTO(...) diretamente onde precisar, você chama:
    public static UserDTO fromModel(UserModel user){
        return new UserDTO(user);
    }
}
