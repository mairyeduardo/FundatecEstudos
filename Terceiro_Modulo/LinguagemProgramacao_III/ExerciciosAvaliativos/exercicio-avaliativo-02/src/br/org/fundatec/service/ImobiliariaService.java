package br.org.fundatec.service;

import br.org.fundatec.model.*;

public class ImobiliariaService {

    public void vincularImovel(Imobiliaria imobiliaria, Imovel imovel) {
        imobiliaria.getImoveis().add(imovel);
    }

    public void vincularFuncionario(Imobiliaria imobiliaria, Funcionario funcionario) {
        imobiliaria.getFuncionarios().add(funcionario);
    }

    public void vincularCliente(Imobiliaria imobiliaria, Cliente cliente) {
        imobiliaria.getClientes().add(cliente);
    }



}