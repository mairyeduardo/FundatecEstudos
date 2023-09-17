package br.org.fundatec.service;

import br.org.fundatec.model.*;

import java.math.BigDecimal;

import static java.util.Objects.*;

public class ContratoService {

    private static final BigDecimal RENDA_MINIMA = BigDecimal.valueOf(1500);

    public Contrato criarContrato(Funcionario funcionario, Cliente cliente, Imovel imovel, Imobiliaria imobiliaria) {

        if (isNull(funcionario)) {
            System.out.println("Não é possível criar um Contrato sem um funcionário");
            return null;
        } else if (isNull(cliente)) {
            System.out.println("Não é possível criar um Contrato sem um cliente");
            return null;
        } else if (isNull(imovel)) {
            System.out.println("Não é possível criar um Contrato sem um imovel");
            return null;

        } else if (isNull(imobiliaria)) {
            System.out.println("Não é possível criar um Contrato sem uma imobiliaria");
            return null;

        } else {

            //checar se o funcionario e o cliente nao sao a mesma pessoa
            if (funcionario.getNome().equals(cliente.getNome())) {
                System.out.println("=======================================================================");
                System.out.println("Um funcionario nao pode realizar uma venda para ele mesmo.");
                return null;

            } else {
                // Checar se renda do cliente é maior que R$1.500
                if (cliente.getRendaMensal().compareTo(RENDA_MINIMA) != -1) {

                    Contrato contrato = new Contrato(1L, funcionario, cliente, imovel, imobiliaria);
                    System.out.println("=======================================================================");
                    System.out.println("Contrato criado com sucesso para o Imóvel: " + imovel.getIdImovel());
                    return contrato;

                } else {
                    System.out.println("=======================================================================");
                    System.out.println("Não é possível criar um Contrato se a renda do cliente é menor que R$ " + RENDA_MINIMA);
                    return null;
                }

            }


        }
    }


}
