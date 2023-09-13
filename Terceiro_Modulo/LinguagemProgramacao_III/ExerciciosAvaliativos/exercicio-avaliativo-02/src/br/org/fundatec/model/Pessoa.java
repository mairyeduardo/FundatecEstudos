package br.org.fundatec.model;

import java.math.BigDecimal;

public abstract class Pessoa {

    private Long idPessoa;
    private String nome;
    private String cpf;
    Endereco endereco;

    public Pessoa(Long idPessoa, String nome, String cpf, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Long getIdPessoa() {
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
