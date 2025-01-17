package ey.codemotion.hexagonal.application.port.out;

import java.util.List;
import ey.codemotion.hexagonal.domain.model.Pokemon;

public interface LoadPokemonPort {
    List<Pokemon> loadAllPokemons();
    Pokemon loadPokemonById(String id);
}
