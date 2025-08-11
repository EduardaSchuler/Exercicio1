package com.exercicio1.Exercicio1.BLL.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio1.Exercicio1.BLL.Converter.ProdutoDTOtoProdutoModel;
import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;
import com.exercicio1.Exercicio1.BLL.Service.Contracts.IProdutoService;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IProdutoRepository;

@Service
public class ProdutoService implements IProdutoService{

    @Autowired
    IProdutoRepository produtoRepository;

    @Override
    public Boolean cadastraProduto(ProdutoDTO produto) {
        return produtoRepository.cadastraProduto(ProdutoDTOtoProdutoModel.converter(produto));
    }

    @Override
    public Boolean atualizaProduto(ProdutoDTO produto) {
        return produtoRepository.atualizaProduto(ProdutoDTOtoProdutoModel.converter(produto));
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
