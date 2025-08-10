package com.exercicio1.Exercicio1.DAO.Repository.Contracts;

import java.text.DateFormat;

public interface IUserRepository {
    //busca de cada info por vez para não causar sobrecarga 
    public String getNome(int id);
    public DateFormat getDataNascimento(int id);
    public int getNumDependentes(int id);
}
