package br.org.fundatec.model;

import java.math.BigDecimal;

public class Contrato {

    private Long idContrato;
    Funcionario funcionario;
    Cliente cliente;
    Imovel imovel;

    Imobiliaria imobiliaria;

    public Contrato(Long idContrato, Funcionario funcionario, Cliente cliente, Imovel imovel, Imobiliaria imobiliaria) {
        this.idContrato = idContrato;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.imovel = imovel;
        this.imobiliaria = imobiliaria;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }
}
