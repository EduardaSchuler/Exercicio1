package com.exercicio1.Exercicio1.WebAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio1.Exercicio1.BLL.DTO.VendaDTO;
import com.exercicio1.Exercicio1.BLL.Service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    // Consulta de compras por usuário (id int)
    @GetMapping("/usuario/{userId}")
    public List<VendaDTO> consultarComprasPorUsuario(@PathVariable int userId) {
        return vendaService.consultaDeComprasPorUsuario(userId);
    }

    // Realizar uma venda
    @PostMapping
    public ResponseEntity<VendaDTO> realizarVenda(@RequestBody VendaDTO vendaDTO) {
        VendaDTO vendaRealizada = vendaService.realizarVenda(vendaDTO);
        return ResponseEntity.ok(vendaRealizada);
    }
}
