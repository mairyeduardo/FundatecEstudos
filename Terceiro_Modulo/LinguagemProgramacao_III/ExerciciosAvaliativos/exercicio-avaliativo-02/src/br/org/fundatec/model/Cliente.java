package br.org.fundatec.model;

import java.math.BigDecimal;

public class Cliente extends Pessoa {

    private Long idCliente;
    TipoCliente tipoCliente;
    private BigDecimal rendaMensal;

    public Cliente(Long idPessoa, String nomePessoa, Endereco endereco, String cpfPessoa, Long idCliente, TipoCliente tipoCliente, BigDecimal rendaMensal) {
        super(idPessoa, nomePessoa, cpfPessoa, endereco);
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.rendaMensal = rendaMensal;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
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
