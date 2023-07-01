package br.com.fundatec.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.hibernate.Length;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("Pessoa Juridica")
public class PessoaJuridica extends Pessoa{

    @Column(length = 50, nullable = false)
    private String cnpj;
    @Column(length = 150, nullable = false)
    private String razaoSocial;
    @Column(length = 31, nullable = false)
    private LocalDate dataCriacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
