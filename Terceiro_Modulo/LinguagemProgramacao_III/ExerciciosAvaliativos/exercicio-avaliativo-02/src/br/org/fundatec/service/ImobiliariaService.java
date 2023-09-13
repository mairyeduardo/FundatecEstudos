package br.org.fundatec.service;

import br.org.fundatec.model.*;

public class ImobiliariaService {

    public void vincularFuncionario(Imobiliaria imobiliaria, Funcionario funcionario) {
        imobiliaria.getFuncionarios().add(funcionario);
    }

    public void vincularCliente(Imobiliaria imobiliaria, Cliente cliente) {
        // TODO Completar
    }

}