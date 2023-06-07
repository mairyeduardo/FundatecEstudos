package br.org.fundatec.repository;

import br.org.fundatec.model.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {

    private List<Pet> petsNoBanco = new ArrayList<>();
    public PetRepository() {
        petsNoBanco.addAll(List.of(
                        new Pet(0, "Viralata", "caramelo"),
                        new Pet(1, "siames", "preto"),
                        new Pet(2, "pitbul", "marrom"),
                        new Pet(3, "alemao", "preto e branco")
                )
        );
    }

    public List<Pet> findAll(){
        return petsNoBanco;
    }

    public Pet create (Pet pet) {
        Integer index = petsNoBanco.size() + 1;
        pet.setId(index);
        petsNoBanco.add(pet);
        return pet;
    }

    public Pet edit (Integer id, Pet pet) {
        //localizar o index
        pet.setId(id);
        var index = petsNoBanco.lastIndexOf(pet);
        if(index < 0) {
            throw new RuntimeException("Item de id: " + id + " não localizado");
        }
        petsNoBanco.set(index, pet);
        return pet;
    }

    public void deleteById (Integer id){
        //localizar o index
        Pet pet = new Pet(id);
        pet.setId(id);
        var index = petsNoBanco.lastIndexOf(pet);
        if(index < 0) {
            throw new RuntimeException("Item de id: " + id + " não localizado");
        }
        petsNoBanco.remove(index);
    }

}
