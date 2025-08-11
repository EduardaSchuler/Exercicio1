package com.exercicio1.Exercicio1.BLL.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio1.Exercicio1.BLL.Service.Contracts.IVendaService;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IVendaRepository;

@Service
public class VendaService implements IVendaService{
    
    @Autowired
    IVendaRepository vendaRepository;

    
}
