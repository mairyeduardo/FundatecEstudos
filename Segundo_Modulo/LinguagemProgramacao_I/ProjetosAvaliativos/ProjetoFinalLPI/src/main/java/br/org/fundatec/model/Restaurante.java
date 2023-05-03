package br.org.fundatec.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * class Restaurante,
 * guarda os dados da Tabela restaurante em suas colunas.
 */
@Entity
@Table(name = "Restaurante")
public class Restaurante implements ModelMetodos {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "rest_generator")
    @TableGenerator(name = "rest_generator",
            table = "chave",
            pkColumnName = "id",
            valueColumnName = "valor",
            allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    public Restaurante() {
    }

    public Restaurante(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante rest = (Restaurante) o;
        return id.equals(rest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}