package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "pokemons")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pokemon_name", nullable = false)
    private String name;

    @Column(name = "combat_power", nullable = false)
    private int combatPower;

    @Column(name = "health_points", nullable = false)
    private int healthPoints;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCombatPower() {
        return combatPower;
    }

    public void setCombatPower(int combatPower) {
        this.combatPower = combatPower;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
