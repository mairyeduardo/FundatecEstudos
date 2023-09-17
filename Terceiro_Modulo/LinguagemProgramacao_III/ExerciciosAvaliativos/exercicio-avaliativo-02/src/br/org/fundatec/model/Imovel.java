package br.org.fundatec.model;

import java.math.BigDecimal;

public class Imovel {

    private Long idImovel;
    private BigDecimal valorImovel;
    private String descricao;
    Endereco endereco;
    TipoImovel tipoImovel;
    Imobiliaria imobiliaria;

    public Imovel(Long idImovel, BigDecimal valorImovel, String descricao, Endereco endereco, TipoImovel tipoImovel, Imobiliaria imobiliaria) {
        this.idImovel = idImovel;
        this.valorImovel = valorImovel;
        this.descricao = descricao;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.imobiliaria = imobiliaria;
    }

    public Long getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(Long idImovel) {
        this.idImovel = idImovel;
    }

    public BigDecimal getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(BigDecimal valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }
}
