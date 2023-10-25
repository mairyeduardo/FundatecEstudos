package poke.api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poke.api.model.Pokemon;
import poke.api.service.PokemonService;

import java.util.List;

@RestController
@RequestMapping("api/v1/pokemon")
public class PokemonController {

    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> BuscarTodosPokemons() {
        return ResponseEntity.ok(this.pokemonService.buscarTodos());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Pokemon> BuscarPokemonPeloNome(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(this.pokemonService.buscarPokemonPorNome(nome));
    }


}
