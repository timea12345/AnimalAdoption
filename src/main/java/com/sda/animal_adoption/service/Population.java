package com.sda.animal_adoption.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Population {

    DatabasePopulation databasePopulation;

    @Autowired
    public Population(DatabasePopulation databasePopulation) {
        this.databasePopulation = databasePopulation;
    }

    public void saveData() {
        databasePopulation.populate();
    }

}
