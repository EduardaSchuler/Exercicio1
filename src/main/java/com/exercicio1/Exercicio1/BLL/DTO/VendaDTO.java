package com.exercicio1.Exercicio1.BLL.DTO;

import java.util.List;

import com.exercicio1.Exercicio1.DAO.Model.VendaModel;

public class VendaDTO {
    private UserDTO user;
    private List<ProdutoDTO> produtos;
    private Double imposto;
    private Double valorTotal;
    
    public VendaDTO (VendaModel venda){
        this.user = UserDTO.fromModel(venda.getUser());
        this.produtos = venda.getProdutos().stream()
            .map(ProdutoDTO::fromModel)
            .toList(); 
        this.imposto = venda.getImposto();
        this.valorTotal = venda.getImposto();
    }

    public UserDTO getUser() {
        return user;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public Double getImposto() {
        return imposto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public VendaDTO fromModel(VendaModel venda){
        return new VendaDTO(venda);
    }
}
