package br.com.org.fundatec.model;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo){
        super(marca, modelo, 10.00, 15.00, 5.00, 30.00 );
    }

    @Override
    public double calculoTarifa(Double tempo) {
        return super.calculoTarifa(tempo);
    }
}
