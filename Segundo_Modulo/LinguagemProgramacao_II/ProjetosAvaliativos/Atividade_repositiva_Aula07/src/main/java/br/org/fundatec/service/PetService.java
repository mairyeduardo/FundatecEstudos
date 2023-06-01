package br.org.fundatec.service;

import br.org.fundatec.model.Pet;
import br.org.fundatec.repository.PetRepository;

import java.util.List;

public class PetService {

    private PetRepository petRepository;

    public PetService(){

    }

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> listarPets(){
        return petRepository.listar();
    }

    public void salvarPet(Pet pet){
        petRepository.salvar(pet);
    }

    public void editarPet(Integer id, Pet pet){
        petRepository.editar(id, pet);
    }

    public void excluirPetPorId(Integer id){
        petRepository.excluirPorId(id);
    }
}
