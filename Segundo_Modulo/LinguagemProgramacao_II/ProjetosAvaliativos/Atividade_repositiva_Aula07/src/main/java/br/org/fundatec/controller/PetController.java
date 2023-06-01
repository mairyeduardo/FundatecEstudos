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

}

