package com.exercicio1.Exercicio1.BLL.Converter;

import com.exercicio1.Exercicio1.BLL.DTO.VendaDTO;
import com.exercicio1.Exercicio1.DAO.Model.VendaModel;

public class VendaDTOtoVendaModel {
    public static VendaModel converter (VendaDTO vendaDTO){
        return new VendaModel(
            UserDTOtoUserModel.converter(vendaDTO.getUser()),
            vendaDTO.getProdutos()
                .stream()
                .map(p -> ProdutoDTOtoProdutoModel.converter(p))
                .toList(),
            vendaDTO.getImposto(), 
            vendaDTO.getValorTotal());
    }
}
