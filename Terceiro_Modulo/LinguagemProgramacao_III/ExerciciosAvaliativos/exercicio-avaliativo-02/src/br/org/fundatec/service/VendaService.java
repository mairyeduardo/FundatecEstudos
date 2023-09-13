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

    public void venderImovel(Funcionario funcionario, Cliente cliente, Imovel imovel) {

        Contrato contratoVenda = contratoService.criarContrato(funcionario, cliente, imovel);

        System.out.println(contratoVenda);
        System.out.println("Venda do Imóvel " + imovel.getIdImovel() + " realizada com sucesso!");
        System.out.println("Funcionário que realizou a venda: " + funcionario.getNome());
        System.out.println("Valor do Imóvel: R$" + imovel.getValorImovel());
        System.out.println("Comissão gerada para o Funcionário " + funcionario.getNome() + " no valor de R$" +
                comissaoService.calcularComissaoVenda(imovel));
    }

}
