package TesteOrdenacao;

public class Carro implements Comparavel{

    private String marca;
    private String modelo;
    private Integer cilindrada;


    public Carro (String marca, String modelo, Integer cilindrada){
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int comparar(Object o) {
        if (o instanceof Carro) {
            Carro car = (Carro) o;

            if (this.cilindrada == car.cilindrada) {
                return 0;
            }

            if (this.cilindrada < car.cilindrada) {
                return +1;
            }

            return -1;
        }
        return -1;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}