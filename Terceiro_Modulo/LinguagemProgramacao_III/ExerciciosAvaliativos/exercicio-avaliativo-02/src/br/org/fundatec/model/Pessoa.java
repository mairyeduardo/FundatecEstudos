package br.org.fundatec.model;

import java.math.BigDecimal;

public abstract class Pessoa {

    private BigDecimal idPessoa;
    private String nome;
    private String cpf;

    Endereco endereco;

    public Pessoa(BigDecimal idPessoa, String nome, String cpf, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public BigDecimal getIdPessoa() {
        return idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
