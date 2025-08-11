package com.exercicio1.Exercicio1.BLL.Service.Contracts;

import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;

public interface IProdutoService {
    Boolean cadastraProduto(ProdutoDTO produto);
    Boolean atualizaProduto(ProdutoDTO produto);
    Boolean apagaProduto(String codigo);
    ProdutoDTO buscaProdutoPorCodigo(String codigo);
    ProdutoDTO buscaProdutoPorDescricao(String descricao);
}
