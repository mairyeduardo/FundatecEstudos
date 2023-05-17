package br.com.org.fundatec.model;

public class Carro extends Veiculo {

    private Double valor;

    public Carro(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void calculoTarifa(int tempo) {

    }
}
