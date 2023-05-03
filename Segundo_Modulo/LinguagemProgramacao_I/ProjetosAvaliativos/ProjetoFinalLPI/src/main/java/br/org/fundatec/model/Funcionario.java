package br.org.fundatec.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * class Funcionario,
 * guarda os dados da tabela funcionario em suas colunas.
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario implements ModelMetodos {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE , generator="func_generator")
    @TableGenerator(name="func_generator",
            table="chave",
            pkColumnName="id",
            valueColumnName="valor",
            allocationSize=1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<Voto> votos;

    public Funcionario() {
    }

    public Funcionario(String nome) {
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

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public void add(Voto voto) {
        if(votos == null) {
            votos = new ArrayList<>();
        }

        voto.setFuncionario(this);
        votos.add(voto);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario func = (Funcionario) o;
        return Objects.equals(id, func.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\''+
                '}';
    }

}