package br.org.fundatec.service;

import br.org.fundatec.model.Pet;
import br.org.fundatec.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public List<Pet> findAll(){
      return petRepository.findAll();
    }

    public Pet create(Pet pet) {
        return petRepository.create(pet);
    }

    public Pet editar(Integer id, Pet pet) {
        return petRepository.edit(id, pet);
    }

    public void deleteById(Integer id) {
        petRepository.deleteById(id);
    }

}
