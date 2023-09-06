package br.org.fundatec.model;

import java.math.BigDecimal;

public class Contrato {

    private Long idContrato;
    Funcionario funcionario;
    Cliente cliente;
    Imovel imovel;

    public Contrato(Long idContrato, Funcionario funcionario, Cliente cliente, Imovel imovel) {
        this.idContrato = idContrato;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.imovel = imovel;
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
}