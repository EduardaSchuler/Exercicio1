package com.exercicio1.Exercicio1.BLL.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio1.Exercicio1.BLL.DTO.ProdutoDTO;
import com.exercicio1.Exercicio1.BLL.DTO.VendaDTO;
import com.exercicio1.Exercicio1.BLL.Service.Contracts.IVendaService;
import com.exercicio1.Exercicio1.DAO.Repository.Contracts.IVendaRepository;

@Service
public class VendaService implements IVendaService{
    
    @Autowired
    IVendaRepository vendaRepository;

    @Override
    public List<VendaDTO> consultaDeComprasPorUsuario(int id) {
        return vendaRepository.consultaDeComprasPorUsuario(id)
            .stream()
            .map(VendaDTO::fromModel)
            .toList();
    }

    @Override
    public VendaDTO realizarVenda(VendaDTO venda) {

        // Calcular idade do usuário a partir de dataNascimento 
        int idadeUsuario = calcularIdade(venda.getUser().getDataNascimento());
        int numDependentes = venda.getUser().getNumDependentes();

        // Contar quantidade de cada produto na lista (agrupando por código do produto)
        Map<String, List<ProdutoDTO>> produtosAgrupados = venda.getProdutos()
            .stream()
            .collect(Collectors.groupingBy(ProdutoDTO::getCodigo));

        Double impostoTotal = 0.0;
        Double valorTotal = 0.0;

        for (Map.Entry<String, List<ProdutoDTO>> entry : produtosAgrupados.entrySet()) {
            List<ProdutoDTO> produtosIguais = entry.getValue();

            ProdutoDTO produto = produtosIguais.get(0); // qualquer um serve, todos tem a mesma categoria e preço

            int quantidadeComprada = produtosIguais.size();

            Double precoUnitario = produto.getPrecoUnitario();
            String categoria = produto.getCategoria();

            Double precoBase = precoUnitario * quantidadeComprada;

            double taxaImposto = calcularTaxaImposto(categoria, idadeUsuario, numDependentes);

            Double valorImposto = precoBase * taxaImposto;
            Double valorComImposto = precoBase + valorImposto;

            impostoTotal += valorImposto;
            valorTotal += valorComImposto;
        }

        // Atualiza os campos no DTO
        venda = new VendaDTO(
            venda.getUser(),
            venda.getProdutos(),
            impostoTotal,
            valorTotal
        );

        return venda;
    }

    private int calcularIdade(Date dataNascimento) {
        if (dataNascimento == null) return 0;
        LocalDate nascimento = dataNascimento.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
        LocalDate hoje = LocalDate.now();
        return Period.between(nascimento, hoje).getYears();
    }

    private double calcularTaxaImposto(String categoria, int idadeUsuario, int numDependentes) {
        double taxa;

        if (categoria.equalsIgnoreCase("ALIMENTICIO")) {
            taxa = 0.05;
        } else if (categoria.equalsIgnoreCase("AUTOMOTIVO")) {
            taxa = 0.30;
        } else if (categoria.equalsIgnoreCase("BEBIDA_ALCOOLICA")) {
            taxa = 1.00;
        } else {
            taxa = 0.17;
        }

        boolean isBebida = categoria.equalsIgnoreCase("BEBIDA_ALCOOLICA");

        if (idadeUsuario > 60 && !isBebida) {
            taxa = 0.0;
        } else if (numDependentes > 3 && !isBebida) {
            taxa *= 0.5;
        }

        return taxa;
    }

}
