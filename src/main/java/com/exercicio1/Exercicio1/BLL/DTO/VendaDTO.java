package com.exercicio1.Exercicio1.BLL.DTO;

import java.util.List;

import com.exercicio1.Exercicio1.DAO.Model.VendaModel;

public class VendaDTO {
    private UserDTO user;
    private List<ProdutoDTO> produtos;
    private Double imposto;
    private Double valorTotal;
    
    public VendaDTO(UserDTO user, List<ProdutoDTO> produtos, Double imposto, Double valorTotal) {
        this.user = user;
        this.produtos = produtos;
        this.imposto = imposto;
        this.valorTotal = valorTotal;
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

    public static VendaDTO fromModel(VendaModel venda){
        return new VendaDTO(
            UserDTO.fromModel(venda.getUser()),
            venda.getProdutos().stream()
                .map(ProdutoDTO::fromModel)
                .toList(),
            venda.getImposto(),
            venda.getValorTotal()
        );
    }
}
