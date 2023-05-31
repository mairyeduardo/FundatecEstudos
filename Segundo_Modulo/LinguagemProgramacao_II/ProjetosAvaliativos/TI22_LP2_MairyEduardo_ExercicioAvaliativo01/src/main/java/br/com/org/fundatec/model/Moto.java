package br.com.org.fundatec.model;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo){
        super(marca, modelo, 5.00, 7.00, 2.00, 10.00);
    }

    @Override
    public double calculoTarifa(Double tempo) {
        return super.calculoTarifa(tempo);
    }
}
