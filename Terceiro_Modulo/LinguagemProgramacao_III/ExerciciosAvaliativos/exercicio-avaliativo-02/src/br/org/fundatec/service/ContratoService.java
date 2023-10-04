package br.org.fundatec.service;

import br.org.fundatec.model.*;

import java.math.BigDecimal;

import static java.util.Objects.*;

public class ContratoService {

    /**
     * Utilização da regra de clean code:
     * Regra de nomes pronunciáveis e buscáveis
     */
    private static final BigDecimal RENDA_MINIMA = BigDecimal.valueOf(1500);

    /**
     * Código foi refatorado para utilizar as regras do cleanCode:
     * Regra de métodos com nomes descritivos
     * Regra de métodos Pequenos e com um objetivo
     * Regra de design Utilizando injeção de dependência
     * Regras sobre entendimento do código - Seja consistente
     */

    public Contrato criarContrato(Funcionario funcionario, Cliente cliente, Imovel imovel, Imobiliaria imobiliaria) {

        Contrato contrato = null;

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

            if (!isFuncionarioIgualCliente(funcionario, cliente)) {
                if (isRendaClienteMaiorQueRendaMinima(cliente, funcionario, imovel, imobiliaria)) {
                    contrato = new Contrato(1L, funcionario, cliente, imovel, imobiliaria);
                    System.out.println("=======================================================================");
                    System.out.println("Contrato criado com sucesso para o Imóvel: " + imovel.getIdImovel());
                    return contrato;
                } else {
                    System.out.println("=======================================================================");
                    System.out.println("Não é possível criar um Contrato se a renda do cliente é menor que R$ " + RENDA_MINIMA);
                    return null;
                }

            } else {
                System.out.println("=======================================================================");
                System.out.println("Não é possível criar um Contrato se a renda do cliente é menor que R$ " + RENDA_MINIMA);
                return null;
            }
        }
    }


    private boolean isFuncionarioIgualCliente(Funcionario funcionario, Cliente cliente) {
        if (funcionario.getNome().equals(cliente.getNome())) {
            System.out.println("=======================================================================");
            System.out.println("Um funcionario nao pode realizar uma venda para ele mesmo.");
            return true;
        }
        return false;
    }

    private boolean isRendaClienteMaiorQueRendaMinima(Cliente cliente, Funcionario funcionario, Imovel imovel, Imobiliaria imobiliaria) {
        if (cliente.getRendaMensal().compareTo(RENDA_MINIMA) != -1) {
            System.out.println("Renda do Cliente é maior que a renda minima necessaria");
            return true;
        }
        return false;
    }
}
