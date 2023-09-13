package br.org.fundatec.service;

import br.org.fundatec.model.Cliente;
import br.org.fundatec.model.Contrato;
import br.org.fundatec.model.Funcionario;
import br.org.fundatec.model.Imovel;

import java.math.BigDecimal;

import static java.util.Objects.*;

public class ContratoService {

    private static final BigDecimal RENDA_MINIMA = BigDecimal.valueOf(1500);

    public Contrato criarContrato(Funcionario funcionario, Cliente cliente, Imovel imovel) {

        if (isNull(funcionario)) {
            System.out.println("Não é possível criar um Contrato sem um funcionário");
            return null;
        } else if (isNull(cliente)) {
            System.out.println("Não é possível criar um Contrato sem um cliente");
            return null;
        } else if (isNull(imovel)) {
            System.out.println("Não é possível criar um Contrato sem um imovel");
            return null;
        } else {
            // Checa se renda do cliente é maior que R$1.500

            if (cliente.getRendaMensal().compareTo(RENDA_MINIMA) != -1) {

                Contrato contrato = new Contrato(1L, funcionario, cliente, imovel);
                System.out.println("Contrato criado com sucesso para o Imóvel: " + imovel.getIdImovel());
                return contrato;

            } else {
                System.out.println("Não é possível criar um Contrato se a renda do cliente é menor que R$ " + RENDA_MINIMA);
                return null;
            }

        }
    }


}
