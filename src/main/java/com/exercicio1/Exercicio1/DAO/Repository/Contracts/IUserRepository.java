package com.exercicio1.Exercicio1.DAO.Repository.Contracts;

import java.text.DateFormat;

public interface IUserRepository {
    //busca de cada info por vez para não causar sobrecarga 
    String getNome(String id);
    DateFormat getDataNascimento(String id);
    int getNumDependentes(String id);
}
