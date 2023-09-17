package br.org.fundatec.service;

import br.org.fundatec.model.*;

import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private ContratoService contratoService;
    private ComissaoService comissaoService;

    public VendaService() {
        this.contratoService = new ContratoService();
        this.comissaoService = new ComissaoService();
    }

    public void venderImovel(Funcionario funcionario, Cliente cliente, Imovel imovel, Imobiliaria imobiliaria) {

        Contrato contratoVenda = contratoService.criarContrato(funcionario, cliente, imovel, imobiliaria);

        if (contratoVenda == null) {
            System.out.println("Não foi possivel realizar a venda do Imóvel: " + imovel.getIdImovel() + ", Contrato não segue os termos de Compra e Venda");

        } else {

            System.out.println("Venda do Imóvel realizada com sucesso!");
            System.out.println("Imobiliaria: " + imobiliaria.getNomeImobiliaria());
            System.out.println("Descrição do Imóvel: " + imovel.getDescricao());
            System.out.println("Valor do Imóvel: R$" + imovel.getValorImovel());
            System.out.println("Cliente que realizou a compra: " + cliente.getNome());
            System.out.println("Funcionário que realizou a venda: " + funcionario.getNome());
            System.out.println("Comissão gerada para o Funcionário no valor de R$" +
                    comissaoService.calcularComissaoVenda(imovel));

        }
    }

}
