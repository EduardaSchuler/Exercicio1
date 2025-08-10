package com.exercicio1.Exercicio1.BLL.Service.Contracts;

import java.text.DateFormat;

public interface IUserService {
    public String getNome(String id);
    public DateFormat getDataNascimento(String id);
    public int getNumDependentes(String id);
}
