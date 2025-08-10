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

    public String getNome(int id) {
        return userRepository.getNome(id);
    }

    public DateFormat getDataNascimento(int id) {
        return userRepository.getDataNascimento(id);
    }

    public int getNumDependentes(int id) {
        return userRepository.getNumDependentes(id);
    }
    
}
