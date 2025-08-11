package com.exercicio1.Exercicio1.BLL.Service.Contracts;

import java.util.List;

import com.exercicio1.Exercicio1.BLL.DTO.VendaDTO;

public interface IVendaService {
    List<VendaDTO> consultaDeComprasPorUsuario(int id);
    VendaDTO realizarVenda(VendaDTO venda);
}
