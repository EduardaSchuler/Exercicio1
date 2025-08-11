package com.exercicio1.Exercicio1.BLL.Service;

import com.exercicio1.Exercicio1.BLL.Converter.ProdutoDTOtoProdutoModel;
import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;
import com.exercicio1.Exercicio1.BLL.Service.Contracts.IProdutoService;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IProdutoRepository;

public class ProdutoService implements IProdutoService{

    IProdutoRepository produtoRepository;
    ProdutoDTOtoProdutoModel DTOtoModel;

    @Override
    public Boolean cadastraProduto(ProdutoDTO produto) {
        return produtoRepository.cadastraProduto(DTOtoModel.converter(produto));
    }

    @Override
    public Boolean atualizaProduto(ProdutoDTO produto) {
        return produtoRepository.atualizaProduto(DTOtoModel.converter(produto));
    }

    @Override
    public Boolean apagaProduto(String codigo) {
        return produtoRepository.apagaProduto(codigo);
    }

    @Override
    public ProdutoDTO buscaProdutoPorCodigo(String codigo) {
        return ProdutoDTO.fromModel(produtoRepository.buscaProdutoPorCodigo(codigo));
    }

    @Override
    public ProdutoDTO buscaProdutoPorDescricao(String descricao) {
        return ProdutoDTO.fromModel(produtoRepository.buscaProdutoPorCodigo(descricao));
    }
    
}
