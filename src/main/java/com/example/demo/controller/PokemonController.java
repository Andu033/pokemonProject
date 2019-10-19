package com.example.demo.controller;

import com.example.demo.models.Pokemon;
import com.example.demo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping(value = "/pokemon/get")
    public Pokemon getPokemon(){

        return new Pokemon();
    }

    @PostMapping(value = "/pokemon/save")
    public Pokemon savePokemon(@RequestBody Pokemon pokemon){
        return pokemonService.save(pokemon);
    }

}
