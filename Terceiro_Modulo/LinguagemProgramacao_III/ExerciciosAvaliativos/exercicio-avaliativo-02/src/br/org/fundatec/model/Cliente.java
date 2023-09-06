package br.org.fundatec.model;

import java.math.BigDecimal;

public class Cliente extends Pessoa {

    private BigDecimal idCliente;
    TipoCliente tipoCliente;

    private BigDecimal rendaMensal;

    public Cliente(BigDecimal idPessoa,String nomePessoa, Endereco endereco, String cpfPessoa, BigDecimal idCliente, TipoCliente tipoCliente, BigDecimal rendaMensal) {
        super(idPessoa, nomePessoa, cpfPessoa, endereco);
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.rendaMensal = rendaMensal;
    }

    public BigDecimal getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }
}
