package br.org.fundatec.model;


import java.util.Objects;

public class Pet {

    private Integer Id;
    private String raca;
    private String nome;

    public Pet(Integer id){
        this.Id = id;
    }
    public Pet(Integer id, String raca, String nome) {
        this.raca = raca;
        this.nome = nome;
        this.Id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(Id, pet.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
