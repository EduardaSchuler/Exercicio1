package com.exercicio1.Exercicio1.DAO.Repository.Contracts;

import java.util.List;

import com.exercicio1.Exercicio1.DAO.Model.VendaModel;

public interface IVendaRepository {
    List<VendaModel> consultaDeComprasPorUsuario(int id); // identificador unico do usuário
    VendaModel realizarVenda(VendaModel venda);
}
