package TesteOrdenacao;

public class Animal implements Comparavel {

    private String especie;
    private String raca;

    public Animal(String especie, String raca) {
        this.especie = especie;
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int comparar(Object o) {

        int comparacao = 0;

        if (o instanceof Animal) {
            Animal animal = (Animal) o;
            comparacao = this.getEspecie().compareTo(animal.getEspecie());

            //Se os autores forem iguais, compara o titulo dos livros.
            if (comparacao == 0) {
                comparacao = this.getRaca().compareTo(animal.getRaca());
            }
        }

        return comparacao;
    }


}

// Crie uma classe Animal que possua os atributos especie e
// raca. Faça está classe implementar a interface Comparavel,
// e implemente o método comparar de forma que compare por  especie e raca, gerando uma ordenação crescente.