package com.exercicio1.Exercicio1.BLL.DTO;

import com.exercicio1.Exercicio1.DAO.Model.ProdutoModel;

public class ProdutoDTO{
    private String codigo;
    private String descricao;
    private int qtdEstoque;
    private Double precoUnitario;
    private String categoria;
    
    public ProdutoDTO(ProdutoModel produto) {
        this.codigo = produto.getCodigo();
        this.descricao = produto.getDescricao();
        this.qtdEstoque = produto.getQtdEstoque();
        this.precoUnitario = produto.getPrecoUnitario();
        this.categoria = produto.getCategoria();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public static ProdutoDTO fromModel(ProdutoModel produto){
        return new ProdutoDTO(produto);
    }
}