package TesteOrdenacao;

/**
 * Classe utilizada para testar a ordenação generica.
 */


public class TestarOrdenacao {
    public static void main(String[] args) {
        /* Cria um vetor de livros. */

        Livro[] livros = new Livro[4];
        livros[0] = new Livro("Sakurai", "Almoçando com Java");
        livros[1] = new Livro("Cristiano", "Classes Java em fila indiana");
        livros[2] = new Livro("Sakurai", "Java em todo lugar");
        livros[3] = new Livro("Cristiano", "Viajando no Java");

        Animal[] animais = new Animal[5];
        animais[0] = new Animal("Cachorro","Pitbull");
        animais[1] = new Animal("Gato","Laranja");
        animais[2] = new Animal("Cachorro", "Caramelo");
        animais[3] = new Animal("Cara","Branca");
        animais[4] = new Animal("Cachorro","Salsichinha");

        Carro[] carros = new Carro[3];
        carros[0] = new Carro("Renalt","Logan",1000);
        carros[1] = new Carro("VW","gol",1500);
        carros[2] = new Carro("Fiat","Argo",1300);

        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Pessoa("Carlos","526.245.602-88");
        pessoas[1] = new Pessoa("Mairy","798.132.739-32");
        pessoas[2] = new Pessoa("Pedro","495.135.175-14");
        pessoas[3] = new Pessoa("Marcos",".957.427.617-62");


        /* Ordena os livros */

        Ordenar o = new Ordenar();
        o.ordenar(livros);

        Ordenar o2 = new Ordenar();
        o2.ordenar(animais);

        Ordenar o3 = new Ordenar();
        o3.ordenar(carros);

        Ordenar o4 = new Ordenar();
        o4.ordenar(pessoas);


        /* Imprime os livros ordenados. */
        for(int c = 0; c < livros.length; c++) {
            System.out.println("Autor: " + livros[c].getAutor());
            System.out.println("Livro: " + livros[c].getTitulo());
        }

        System.out.println("\n--------\n");

        for(int c = 0; c < animais.length; c++){
            System.out.println("Especie: " + animais[c].getEspecie());
            System.out.println("Raça: " + animais[c].getRaca());
        }

        System.out.println("\n--------\n");

        for(int c = 0; c < carros.length; c++) {
            System.out.println("Cilindrada: " + carros[c].getCilindrada());
            System.out.println("Modelo: " + carros[c].getModelo());
        }

        System.out.println("\n--------\n");

        for(int c = 0; c < pessoas.length; c++){
            System.out.println("Nome: " + pessoas[c].getNome());
        }

    }
}