package com.exercicio1.Exercicio1.DAO.Repository;

import java.text.DateFormat;

import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IUserRepository;

public class UserRepository implements IUserRepository{

    // implementação dos metodos de busca no banco de dados caso exisir

    @Override
    public String getNome(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    @Override
    public DateFormat getDataNascimento(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataNascimento'");
    }

    @Override
    public int getNumDependentes(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumDependentes'");
    }
    
}
