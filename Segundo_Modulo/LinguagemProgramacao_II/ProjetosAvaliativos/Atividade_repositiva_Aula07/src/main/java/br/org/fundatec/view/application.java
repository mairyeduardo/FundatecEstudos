package br.org.fundatec.view;

import br.org.fundatec.model.Pet;
import br.org.fundatec.repository.PetRepository;

public class application {
    public static void main(String[] args) {

        PetRepository petRepository= new PetRepository();

        petRepository.salvar(new Pet(1, "Cachorro", "Pipoca"));
        petRepository.salvar(new Pet(2, "Gato", "Tatu"));

        System.out.println(petRepository.listar());

        petRepository.excluirPorId(1);

        System.out.println(petRepository.listar());

    }
}
