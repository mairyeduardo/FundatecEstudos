package poke.api.model.dto.converter;

import poke.api.model.Pokemon;
import poke.api.model.dto.PokemonRequestDTO;

public class PokemonConverter {

    public static Pokemon coverterParaEntidade(PokemonRequestDTO pokemonRequest){
        Pokemon pokemonEntity = new Pokemon();
        pokemonEntity.setNome(pokemonRequest.getNome());
        pokemonEntity.setAltura(pokemonRequest.getAltura());
        pokemonEntity.setPeso(pokemonRequest.getPeso());
        pokemonEntity.setLevel(pokemonRequest.getLevel());
        pokemonEntity.setTipo(pokemonRequest.getTipo());

        return pokemonEntity;
    }
}
