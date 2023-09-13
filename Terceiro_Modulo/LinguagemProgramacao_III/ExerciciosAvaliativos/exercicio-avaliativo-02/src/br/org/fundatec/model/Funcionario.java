package br.org.fundatec.model;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

    private Long idFuncionario;
    private BigDecimal salario;
    TipoFuncionario tipoFuncionario;
    Imobiliaria imobiliaria;

    public Funcionario(Long idPessoa,String nomePessoa, Endereco endereco, String cpfPessoa, Long idFuncionario, BigDecimal salario, TipoFuncionario tipoFuncionario, Imobiliaria imobiliaria) {
        super(idPessoa, nomePessoa, cpfPessoa, endereco);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
        this.imobiliaria = imobiliaria;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
}
