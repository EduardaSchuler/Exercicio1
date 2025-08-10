package com.exercicio1.Exercicio1.DAO.Repository;

import java.text.DateFormat;

import org.springframework.stereotype.Repository;

import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IUserRepository;

@Repository
public class UserRepository implements IUserRepository{

    // implementação dos metodos de busca no banco de dados caso exisir

    @Override
    public String getNome(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    @Override
    public DateFormat getDataNascimento(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getDataNascimento'");
    }

    @Override
    public int getNumDependentes(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getNumDependentes'");
    }
    
}
