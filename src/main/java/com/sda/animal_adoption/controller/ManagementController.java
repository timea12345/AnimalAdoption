package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.dao.DatabasePopulation;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/management")
public class ManagementController {

    private DatabasePopulation databasePopulation;

    @Autowired
    public ManagementController(DatabasePopulation databasePopulation) {
        this.databasePopulation = databasePopulation;
    }

    @PostMapping("/save")
    @CrossOrigin("*")
    public void saveData(Animal animal) {
        databasePopulation.populateAnimal(animal);
    }

}
