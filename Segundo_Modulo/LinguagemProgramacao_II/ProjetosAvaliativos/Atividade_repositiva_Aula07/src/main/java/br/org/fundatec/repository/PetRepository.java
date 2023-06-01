package br.org.fundatec.repository;

import br.org.fundatec.model.Pet;
import java.util.ArrayList;
import java.util.List;

public class PetRepository {

    private List<Pet> pets = new ArrayList<>();


    public List<Pet> listar() {
        return pets;
    }

    public void salvar(Pet pet){
        pets.add(pet);
    }

    public void editar(Integer id, Pet pet) {
        int index = -1;
        for(int iter = 0;iter < pets.size();iter++) {
            Pet encontrou = pets.get(iter);
            if(id.equals(encontrou.getId())) {
                index = iter;
                break;
            }
        }

        if(index != -1) {
            Pet achada = pets.get(index);
            pet.setId(achada.getId());
            pets.set(index, pet);

        }
    }

    public void excluirPorId(Integer id) {

        int index = -1;
        for(int iter = 0;iter < pets.size();iter++) {
            Pet encontrou = pets.get(iter);
            if(id.equals(encontrou.getId())) {
                index = iter;
                break;
            }
        }

        if(index > -1) {
            pets.remove(index);
        }
    }

}


