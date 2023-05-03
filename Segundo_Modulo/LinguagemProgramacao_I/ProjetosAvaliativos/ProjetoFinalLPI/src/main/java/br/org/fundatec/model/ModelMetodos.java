package br.org.fundatec.model;

/**
 * interface ModelMetodos,
 * utilizada para guardar os metodos
 * que todos Models desenvolvidos precisam.
 */
public interface ModelMetodos {

    boolean equals(Object o);

    int hashCode();

    String toString();
}
