package br.org.fundatec.model;

import java.math.BigDecimal;

public class Imovel {

    private BigDecimal idImovel;
    private BigDecimal valorImovel;
    Endereco endereco;
    TipoImovel tipoImovel;
    Imobiliaria imobiliaria;



    public Imovel(BigDecimal idImovel, BigDecimal valorImovel, Endereco endereco, TipoImovel tipoImovel, Imobiliaria imobiliaria) {
        this.idImovel = idImovel;
        this.valorImovel = valorImovel;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.imobiliaria = imobiliaria;
    }

    public BigDecimal getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(BigDecimal idImovel) {
        this.idImovel = idImovel;
    }

    public BigDecimal getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(BigDecimal valorImovel) {
        this.valorImovel = valorImovel;
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
