package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.model.User;
import com.sda.animal_adoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/sayHi/{hi}")
    public String sayHi(@PathVariable String hi) {
        return "prefix_" + hi;
    }

    @GetMapping("/findAllA")
    @CrossOrigin("*")
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @PostMapping("/saveA")
    public void saveAnimal(@RequestBody Animal animal) {
        animalService.saveAnimal(animal);
    }

    @DeleteMapping("/deleteA/{id}")
    public void deleteAnimal(@PathVariable Integer id) {
        animalService.delete(id);
    }
}
