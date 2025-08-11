package com.exercicio1.Exercicio1.WebAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;
import com.exercicio1.Exercicio1.BLL.Service.Contracts.IProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Boolean> cadastraProduto(@RequestBody ProdutoDTO produtoDTO) {
        Boolean sucesso = produtoService.cadastraProduto(produtoDTO);
        return ResponseEntity.ok(sucesso);
    }

    @PutMapping
    public ResponseEntity<Boolean> atualizaProduto(@RequestBody ProdutoDTO produtoDTO) {
        Boolean sucesso = produtoService.atualizaProduto(produtoDTO);
        return ResponseEntity.ok(sucesso);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Boolean> apagaProduto(@PathVariable String codigo) {
        Boolean sucesso = produtoService.apagaProduto(codigo);
        return ResponseEntity.ok(sucesso);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<ProdutoDTO> buscaProdutoPorCodigo(@PathVariable String codigo) {
        ProdutoDTO produto = produtoService.buscaProdutoPorCodigo(codigo);
        if (produto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produto);
    }

    @GetMapping("/buscar")
    public ResponseEntity<ProdutoDTO> buscaProdutoPorDescricao(@RequestParam String descricao) {
        ProdutoDTO produto = produtoService.buscaProdutoPorDescricao(descricao);
        if (produto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produto);
    }
}
