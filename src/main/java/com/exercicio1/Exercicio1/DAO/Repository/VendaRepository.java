package com.exercicio1.Exercicio1.DAO.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exercicio1.Exercicio1.DAO.Model.VendaModel;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IVendaRepository;

@Repository
public class VendaRepository implements IVendaRepository{

    @Override
    public List<VendaModel> consultaDeComprasPorUsuario(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'consultaDeComprasPorUsuario'");
    }

    @Override
    public VendaModel realizarVenda(VendaModel venda) {
        throw new UnsupportedOperationException("Unimplemented method 'realizarVenda'");
    }
    
}
