package com.exercicio1.Exercicio1.DAO.Model;

import java.util.List;

public class VendaModel {
    private UserModel user;
    private List<ProdutoModel> produtos;
    private Double imposto;
    private Double valorTotal;
    
    public VendaModel(UserModel user, List<ProdutoModel> produtos, Double imposto, Double valorTotal) {
        this.user = user;
        this.produtos = produtos;
        this.imposto = imposto;
        this.valorTotal = valorTotal;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public Double getImposto() {
        return imposto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public UserModel getUser() {
        return user;
    }
}
