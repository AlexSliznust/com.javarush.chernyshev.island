package com.nicorp.demo2.animals.demo2.animals;

import com.nicorp.demo2.animals.demo2.IslandSimulation;
import com.nicorp.demo2.animals.demo2.island.Location;
import com.nicorp.demo2.animals.demo2.plants.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int maxAge, int maxHunger, int weight, double reproductionChance) {
        super(name, maxAge, maxHunger, reproductionChance, weight);
    }

    @Override
    public void eat() {
        Location location = IslandSimulation.island.getLocation(x, y);
        if (location.hasGrass()) {
            System.out.println(name + " is eating grass");
            super.eat();
            location.setHasGrass(false);
        }
    }
}