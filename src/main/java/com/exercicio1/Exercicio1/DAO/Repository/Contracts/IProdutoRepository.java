package com.exercicio1.Exercicio1.DAO.Repository.Contracts;

import com.exercicio1.Exercicio1.DAO.Model.ProdutoModel;

public interface IProdutoRepository {
    
    Boolean cadastraProduto(ProdutoModel produto);
    Boolean atualizaProduto(ProdutoModel produto);
    Boolean apagaProduto(String codigo);
    ProdutoModel buscaProdutoPorCodigo(String codigo);
    ProdutoModel buscaProdutoPorDescricao(String descricao);
}
