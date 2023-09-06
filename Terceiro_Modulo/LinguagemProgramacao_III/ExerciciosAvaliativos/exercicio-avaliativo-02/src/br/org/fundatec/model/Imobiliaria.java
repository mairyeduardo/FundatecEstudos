package br.org.fundatec.model;

import java.math.BigDecimal;
import java.util.List;

public class Imobiliaria {

    private BigDecimal idImobiliaria;
    private String nomeImobiliaria;
    List <Funcionario> funcionarios;
    List <Cliente> clientes;

    public Imobiliaria(BigDecimal idImobiliaria, String nomeImobiliaria, List<Funcionario> funcionarios, List<Cliente> clientes) {
        this.idImobiliaria = idImobiliaria;
        this.nomeImobiliaria = nomeImobiliaria;
        this.funcionarios = funcionarios;
        this.clientes = clientes;
    }

    public BigDecimal getIdImobiliaria() {
        return idImobiliaria;
    }

    public void setIdImobiliaria(BigDecimal idImobiliaria) {
        this.idImobiliaria = idImobiliaria;
    }

    public String getNomeImobiliaria() {
        return nomeImobiliaria;
    }

    public void setNomeImobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
