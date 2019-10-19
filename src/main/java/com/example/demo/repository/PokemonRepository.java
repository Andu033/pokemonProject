package com.example.demo.repository;

import com.example.demo.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findByName(String name);
}
