package br.org.fundatec.repository;

import br.org.fundatec.model.Pet;

public class PetIndex {
    private final int index;
    private final Pet pet;

    public PetIndex(int index, Pet pet) {
        this.index = index;
        this.pet = pet;
    }

    public int getIndex() {
        return index;
    }

    public Pet getPet() {
        return pet;
    }
}