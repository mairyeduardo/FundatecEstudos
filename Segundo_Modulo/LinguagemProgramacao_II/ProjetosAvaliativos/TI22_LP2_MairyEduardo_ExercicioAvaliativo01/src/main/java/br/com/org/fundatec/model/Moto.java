package br.com.org.fundatec.model;

public class Moto extends Veiculo {

    private Double valor;

    public Moto(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void calculoTarifa(int tempo) {

    }
}
