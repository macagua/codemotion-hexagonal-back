package ey.codemotion.hexagonal.domain.service;

import java.util.List;

import ey.codemotion.hexagonal.domain.model.Pokemon;

public interface PokemonService {
    List<Pokemon> getAllPokemons();
    Pokemon getPokemonById(String id);
}
