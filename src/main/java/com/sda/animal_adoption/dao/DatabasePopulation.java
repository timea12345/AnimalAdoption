package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DatabasePopulation {

    private AnimalService animalService;

    @Autowired
    public DatabasePopulation(AnimalService animalService) {
        this.animalService = animalService;
    }

    public void populateAnimal(Animal animal) {

//        animal.setShelter(animal.getShelter());
        animal.setRace(animal.getRace());
        animal.setDescription(animal.getDescription());
        animal.setAge(animal.getAge());
        animal.setSex(animal.getSex());
//        animal.setPhoto(animal.getPhoto());

        animalService.saveAnimal(animal);
    }

}
