package com.exercicio1.Exercicio1.BLL.Service;

import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio1.Exercicio1.BLL.Service.Contracts.IUserService;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IUserRepository;

@Service
public class UserService implements IUserService{
    
    @Autowired
    IUserRepository userRepository;

    @Override
    public String getNome(String id) {
        return userRepository.getNome(id);
    }

    @Override
    public DateFormat getDataNascimento(String id) {
        return userRepository.getDataNascimento(id);
    }

    @Override
    public int getNumDependentes(String id) {
        return userRepository.getNumDependentes(id);
    }
    
}
