package br.com.org.fundatec.model;

public class Bicicleta extends Veiculo {

    private Double valor;

    public Bicicleta(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void calculoTarifa(int tempo) {
        if (tempo == 30 ) {
            valor = 5.00;
        } else if(tempo == 1 || tempo == 60){
            valor = 7.00;
        } else if(tempo == 24){
            valor = 10.00;
        }
    }
}
