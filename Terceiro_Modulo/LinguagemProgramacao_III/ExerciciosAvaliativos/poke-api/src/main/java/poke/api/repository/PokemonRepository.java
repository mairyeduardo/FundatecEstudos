package poke.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poke.api.model.Pokemon;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    public Pokemon findByNome(String nome);

    List <Pokemon> findByTipo(String tipo);
}
