package br.org.fundatec.service;

import br.org.fundatec.model.Cliente;
import br.org.fundatec.model.Contrato;
import br.org.fundatec.model.Funcionario;
import br.org.fundatec.model.Imovel;

import java.util.ArrayList;
import java.util.List;

public class ContratoService {

    public Contrato criarContrato(Funcionario funcionario, Cliente cliente, Imovel imovel) {
        if (funcionario == null) {
            System.out.println("Não é possível criar um Contrato sem um funcionário");
            return null;
        }
        else if (cliente == null){
            System.out.println("Não é possível criar um Contrato sem um cliente");
            return null;
            }
        else if (imovel == null){
            System.out.println("Não é possível criar um Contrato sem um imovel");
            return null;
        }
        else {
            Contrato contrato = new Contrato(1L, funcionario, cliente, imovel);
            System.out.println("Contrato criado com sucesso para o Imóvel: " + imovel.getIdImovel());
            return contrato;
        }
    }


}
