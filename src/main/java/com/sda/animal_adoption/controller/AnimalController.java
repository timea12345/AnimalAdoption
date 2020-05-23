package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/findAll")
    @CrossOrigin("*")
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @GetMapping("/findById")
    @CrossOrigin("*")
    public Animal findById(@RequestParam(name = "id") Integer id) {
        return animalService.findById(id);
    }

    @PostMapping("/save")
    @CrossOrigin("*")
    public void saveAnimal(@RequestBody Animal animal) {
        animalService.saveAnimal(animal);
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin("*")
    public void deleteAnimal(@PathVariable Integer id) {
        animalService.delete(id);
    }

    @PostMapping("/addAnimal")
    @CrossOrigin("*")
    public void submit(@RequestBody Animal animal) {
        animalService.saveAnimal(animal);
    }

    @PostMapping("/update/{id}")
    @CrossOrigin("*")
    public void update(Integer id, Animal animal) {
        animalService.update(id, animal);
        animalService.saveAnimal(animal);
    }


//    @GetMapping("/sayHi/{hi}")
//    @CrossOrigin("*")
//    public String sayHi(@PathVariable String hi) {
//        return "prefix_" + hi;
//    }
}
