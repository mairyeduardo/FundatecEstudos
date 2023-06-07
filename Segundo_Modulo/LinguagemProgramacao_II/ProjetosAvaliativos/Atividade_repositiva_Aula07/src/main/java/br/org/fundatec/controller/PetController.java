package br.org.fundatec.controller;

import br.org.fundatec.model.Pet;
import br.org.fundatec.repository.PetRepository;
import br.org.fundatec.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(path = "/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService){
        this.petService = petService;
    }


    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public List<Pet> buscaPet() {
        return petService.findAll();
    }

    @RequestMapping( method = RequestMethod.POST)
    @ResponseBody
    public Pet criarPet(@RequestBody Pet pet) {
       return petService.create(pet);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Pet editarPet (
            @PathVariable(name = "id") Integer idPet,
            @RequestBody Pet pet) {
        return petService.editar(idPet,pet);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletarPet(
            @PathVariable(name = "id") Integer idPet){
            petService.deleteById(idPet);
    }
}

