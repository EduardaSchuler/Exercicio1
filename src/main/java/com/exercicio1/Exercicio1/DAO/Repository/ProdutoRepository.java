package com.exercicio1.Exercicio1.DAO.Repository;

import org.springframework.stereotype.Repository;

import com.exercicio1.Exercicio1.DAO.Model.ProdutoModel;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IProdutoRepository;

@Repository
public class ProdutoRepository implements IProdutoRepository{

    // implementação dos metodos no banco de dados caso exisir

    @Override
    public Boolean cadastraProduto(ProdutoModel produto) {
        throw new UnsupportedOperationException("Unimplemented method 'cadastraProduto'");
    }

    @Override
    public Boolean atualizaProduto(ProdutoModel produto) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizaProduto'");
    }

    @Override
    public Boolean apagaProduto(String codigo) {
        throw new UnsupportedOperationException("Unimplemented method 'apagaProduto'");
    }

    @Override
    public ProdutoModel buscaProdutoPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Unimplemented method 'buscaProdutoPorCodigo'");
    }

    @Override
    public ProdutoModel buscaProdutoPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Unimplemented method 'buscaProdutoPorDescricao'");
    }
    
}
