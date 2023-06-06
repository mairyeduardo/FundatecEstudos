package br.org.fundatec.controller;

import br.org.fundatec.model.Pet;
import br.org.fundatec.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/")
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping(method = RequestMethod.GET) // Instrui o spring para cair nesse method nessa URL + Verbo
    @ResponseBody
    public List<Pet> buscaPet() {
        return petService.listarPets();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity criarPet(@RequestBody Pet pet) {
        petService.salvarPet(pet);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deletetarPet(@PathVariable("id") Integer id) {
        Pet pet = petService.procuraPorId(id);
        if(pet != null) {
            petService.excluirPetPorId(id);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity editarOPet(@PathVariable("id") Integer id, @RequestBody Pet pet) {
        Pet petExiste = petService.procuraPorId(id);
        if(petExiste != null) {
            petService.editarPet(id, pet);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity procurarPorId(@PathVariable("id") Integer id) {
        Pet pet = petService.procuraPorId(id);
        if(pet != null) {
            return ResponseEntity.ok(pet);
        } else {
            return ResponseEntity.notFound().build();
        }

    }


}

