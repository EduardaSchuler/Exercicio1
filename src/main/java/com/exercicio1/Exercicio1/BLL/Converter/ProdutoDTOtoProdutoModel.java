package com.exercicio1.Exercicio1.BLL.Converter;

import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;
import com.exercicio1.Exercicio1.DAO.Model.ProdutoModel;

public class ProdutoDTOtoProdutoModel {
    public static ProdutoModel converter (ProdutoDTO produtoDTO){
        return new ProdutoModel(
            produtoDTO.getCodigo(),
            produtoDTO.getDescricao(),
            produtoDTO.getQtdEstoque(),
            produtoDTO.getPrecoUnitario(),
            produtoDTO.getCategoria());
    }
}
