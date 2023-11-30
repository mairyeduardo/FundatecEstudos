package poke.api.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import poke.api.model.Pokemon;
import poke.api.model.dto.PokemonRequestDTO;
import poke.api.model.dto.converter.PokemonConverter;
import poke.api.repository.PokemonRepository;

import java.util.List;

@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> buscarTodos() {
        return pokemonRepository.findAll();
    }

    public Pokemon buscarPokemonPorNome(String nome) {
        return pokemonRepository.findByNome(nome);
    }

    public List<Pokemon> buscarPokemonPeloTipo(String tipo){
        return pokemonRepository.findByTipo(tipo);
    }

    public Integer ListarQuantidadeDePokemons(){
        Integer quantidadePokemons = buscarTodos().size();
        return quantidadePokemons;
    }

    public void adicionar(PokemonRequestDTO pokemonRequestDTO) {
        String verificarNomePokemonASerAdicionado = pokemonRequestDTO.getNome();
        Pokemon pokemonExistente = buscarPokemonPorNome(verificarNomePokemonASerAdicionado);
        if (pokemonExistente != null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Não é possivel adicionar um pokemon repetido." +
                            " O pokemon : " + verificarNomePokemonASerAdicionado + " já existe na base de dados.");
        } else {
            Pokemon pokemonEntity = PokemonConverter.coverterParaEntidade(pokemonRequestDTO);
            pokemonRepository.save(pokemonEntity);
        }
    }

    public Pokemon removerPorId(Long id) {
        Pokemon pokemonParaRemover = pokemonRepository.findById(id).get();
        pokemonRepository.delete(pokemonParaRemover);
        return pokemonParaRemover;
    }

    public Pokemon removerPorNome(String nome) {
        Pokemon pokemonParaRemover = pokemonRepository.findByNome(nome);
        if (pokemonParaRemover == null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Não é possivel remover um pokemon inexistente." +
                            " O pokemon : " + nome + " não existe na base da dados."
            );
        } else {
            pokemonRepository.delete(pokemonParaRemover);
            return pokemonParaRemover;
        }
    }

    public Pokemon alterarPorId(Long id, Pokemon pokemon) {
        Pokemon pokemonEncontrado = pokemonRepository.findById(id).get();
        pokemonEncontrado.setNome(pokemon.getNome());
        pokemonEncontrado.setTipo(pokemon.getTipo());
        pokemonRepository.save(pokemonEncontrado);
        return pokemonEncontrado;
    }
}
