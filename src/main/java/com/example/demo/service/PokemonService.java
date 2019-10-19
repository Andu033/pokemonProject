package com.example.demo.service;

import com.example.demo.models.Pokemon;
import com.example.demo.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon save(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }
}
