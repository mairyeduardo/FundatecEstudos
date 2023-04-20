package TesteOrdenacao;
/**
 * Classe utilizada para representar um Livro, está classe
 * implementa a interface Comparavel.
 */

public class Livro implements Comparavel {
    private String autor;
    private String titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int comparar(Object o) {
        int comparacao = 0;

        //Verifica se o objeto que vai comparar é do tipo Livro.
        if(o instanceof Livro) {
            Livro livro = (Livro) o;
            comparacao = this.getAutor().compareTo(livro.getAutor());

            //Se os autores forem iguais, compara o titulo dos livros.
            if(comparacao == 0) {
                comparacao = this.getTitulo().compareTo(livro.getTitulo());
            }
        }
        return comparacao;
    }
}
