package br.org.fundatec.model;

public class Apuracao {

    private String nomeRestaurante;
    private Long quantidadeVotos;

    public Apuracao(String nomeRestaurate, Long quantidadeVotos){
        this.nomeRestaurante = nomeRestaurate;
        this.quantidadeVotos = quantidadeVotos;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public Long getQuantidadeVotos() {
        return quantidadeVotos;
    }

    @Override
    public String toString() {
        return "Apuracao{" +
                "nomeRestaurante='" + nomeRestaurante + '\'' +
                ", quantidadeVotos=" + quantidadeVotos +
                '}';
    }
}
