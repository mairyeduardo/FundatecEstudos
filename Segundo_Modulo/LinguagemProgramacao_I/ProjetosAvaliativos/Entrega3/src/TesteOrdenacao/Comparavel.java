package TesteOrdenacao;

public interface Comparavel {
    public int comparar(Object o);

}


/**
 * Interface que deve ser implementada por todas as classes que
 * devem ser ordenadas.
 */

/**
 * Assinatura de método que toda classe que quer permitir
 * a comparação entre seus objetos precisa implementar.
 *
 * @parametro o - Objeto que será comparado.
 * @return 0 se os objetos forem iguais.
 *         > 0 se o objeto recebido é menor que o objeto que será comparado.
 *         < 0 se o objeto recebido é maior que o objeto que será comparado.
 */