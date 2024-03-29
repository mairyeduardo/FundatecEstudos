package br.org.fundatec.model;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private Long idImobiliaria;
    private String nomeImobiliaria;
    List<Funcionario> funcionarios;
    List<Cliente> clientes;
    List<Imovel> imoveis;

    public Imobiliaria(Long idImobiliaria, String nomeImobiliaria) {
        this.idImobiliaria = idImobiliaria;
        this.nomeImobiliaria = nomeImobiliaria;
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.imoveis = new ArrayList<>();
    }

    public Long getIdImobiliaria() {
        return idImobiliaria;
    }

    public void setIdImobiliaria(Long idImobiliaria) {
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

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
}
