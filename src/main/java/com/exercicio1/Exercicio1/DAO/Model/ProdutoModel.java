package com.exercicio1.Exercicio1.DAO.Model;

public class ProdutoModel {
    private String codigo;
    private String descricao;
    private int qtdEstoque;
    private Double precoUnitario;
    private String categoria;
    
    public ProdutoModel(String codigo, String descricao, int qtdEstoque, Double precoUnitario, String categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
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

}
