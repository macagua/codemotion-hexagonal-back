package ey.codemotion.hexagonal.application.port.in;

import java.util.List;
import ey.codemotion.hexagonal.domain.model.Pokemon;

public interface GetPokemonQuery {
    List<Pokemon> getAllPokemons();
    Pokemon getPokemonById(String id);
}
