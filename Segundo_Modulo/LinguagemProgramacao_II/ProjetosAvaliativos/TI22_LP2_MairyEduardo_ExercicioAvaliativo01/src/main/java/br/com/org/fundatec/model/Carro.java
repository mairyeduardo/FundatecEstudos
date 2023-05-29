package br.com.org.fundatec.model;

public class Carro extends Veiculo {

    private Double valorAteMeiaHora = 10.00;
    private Double valorAteUmaHora = 15.00;
    private Double valorHoraAdicional = 5.00;
    private Double valorDiaria = 30.00;


    public Carro(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void calculoTarifa(Double tempo) {
        if (tempo > 0 && tempo <= 0.5) {
            System.out.println("Você Pagará o valor da Meia Hora = R$ " + valorAteMeiaHora);
        } else if(tempo > 0.5 && tempo <= 1) {
            System.out.println("Você Pagará o valor de 1 hora = R$ " + valorAteUmaHora);
        } else if (tempo > 1 && tempo <= 2 ) {
            System.out.println("Você Pagará o valor de 1 hora + 1 hora adicional = R$ " + (valorAteUmaHora + valorHoraAdicional));
        } else if (tempo > 2 && tempo <= 3) {
            System.out.println("Você Pagará o valor de 1 hora + 2 horas adicional = R$ " + (valorAteUmaHora + (valorHoraAdicional * 2)));
        } else if (tempo > 3 && tempo <= 4) {
            System.out.println("Você Pagará o valor de 1 hora + 3 horas adicional = R$ " + (valorAteUmaHora + (valorHoraAdicional * 3)));
        } else if (tempo > 4 && tempo <= 5) {
            System.out.println("Você Pagará o valor de 1 hora + 4 horas adicional = R$ " + (valorAteUmaHora + (valorHoraAdicional * 4)));
        } else if (tempo > 5 && tempo <= 6) {
            System.out.println("Você Pagará o valor de 1 hora + 5 horas adicional = R$ " + (valorAteUmaHora + (valorHoraAdicional * 5)));
        } else if( tempo > 6 && tempo <= 24){
            System.out.println("Você Pagará o valor da diaria = R$ " + valorDiaria);
        }else {
            System.out.println("Tempo máximo permitido = 24hrs");
        }
    }
}
