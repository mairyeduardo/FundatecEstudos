package br.com.org.fundatec.model;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    protected Double valorAteMeiaHora = 0.00;
    protected Double valorAteUmaHora = 0.00;
    protected Double valorHoraAdicional = 0.00;
    protected Double valorDiaria = 0.00;

    public Veiculo (String marca, String modelo, Double valorAteMeiaHora, Double valorAteUmaHora, Double valorHoraAdicional, Double valorDiaria){
        this.marca = marca;
        this.modelo = modelo;
        this.valorAteMeiaHora = valorAteMeiaHora;
        this.valorAteUmaHora = valorAteUmaHora;
        this.valorHoraAdicional = valorHoraAdicional;
        this.valorDiaria = valorDiaria;
    }

    public double calculoTarifa(Double tempo) {
        if (tempo > 0 && tempo <= 0.5) {
            System.out.println("Você Pagará o valor da Meia Hora = R$ " + valorAteMeiaHora);
            return valorAteMeiaHora;
        } else if(tempo > 0.5 && tempo <= 1) {
            System.out.println("Você Pagará o valor de 1 hora = R$ " + valorAteUmaHora);
            return valorAteUmaHora;
        } else if (tempo > 1 && tempo <=6) {
            System.out.println("Você Pagará o valor de " + tempo + " hora = R$ " + (valorAteUmaHora + ((tempo -1) * valorHoraAdicional)));
            return valorAteUmaHora + ((tempo -1) * valorHoraAdicional);
        } else if( tempo > 6 && tempo <= 24){
            System.out.println("Você Pagará o valor da diaria = R$ " + valorDiaria);
            return valorAteUmaHora;
        }else {
            System.out.println("Tempo máximo permitido = 24hrs");
            return 0.0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
