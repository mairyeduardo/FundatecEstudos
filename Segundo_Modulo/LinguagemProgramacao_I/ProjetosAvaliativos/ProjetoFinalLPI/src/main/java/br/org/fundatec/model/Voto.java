package br.org.fundatec.model;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

/**
 * class Voto,
 * guarda os dados da tabela de votos em suas colunas.
 */
@Entity

@Table(name = "Voto")
public class Voto implements ModelMetodos{

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE , generator="nota_generator")
    @TableGenerator(name="nota_generator",
            table="chave",
            pkColumnName="id",
            valueColumnName="valor",
            allocationSize=1)
    @Column(name = "id")
    private Integer id;
    @Temporal(TemporalType.DATE)
    @Column(name = "data")
    private Calendar data;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id")
    private Funcionario funcionario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_restaurante", referencedColumnName = "id")
    private Restaurante restaurante;

    public Voto(){

    }

    public Voto(Calendar dataVoto, Restaurante restaurante) {
        super();

        this.data = dataVoto;
        this.restaurante = restaurante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voto voto = (Voto) o;
        return id.equals(voto.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "Voto{" +
                "data=" + data +
                ", restaurante=" + restaurante +
                '}';
    }
}