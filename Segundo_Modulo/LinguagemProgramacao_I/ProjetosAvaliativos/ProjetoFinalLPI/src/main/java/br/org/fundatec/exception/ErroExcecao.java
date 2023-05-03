package br.org.fundatec.exception;

public class ErroExcecao extends Exception {

    /**
     * exception ErroExcecao,
     * @param mensagem
     * possibilita atribuir uma mensagem ao erro.
     */
    public ErroExcecao (String mensagem){
        super(mensagem);
    }
}