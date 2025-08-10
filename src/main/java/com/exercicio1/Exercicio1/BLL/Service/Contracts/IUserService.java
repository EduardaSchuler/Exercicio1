package com.exercicio1.Exercicio1.BLL.Service.Contracts;

import java.text.DateFormat;

public interface IUserService {
    public String getNome(int id);
    public DateFormat getDataNascimento(int id);
    public int getNumDependentes(int id);
}
