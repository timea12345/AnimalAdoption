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

    @GetMapping("/sayHi/{hi}")
    @CrossOrigin("*")
    public String sayHi(@PathVariable String hi) {
        return "prefix_" + hi;
    }

    @GetMapping("/findAll")
    @CrossOrigin("*")
    public List<Animal> findAll() {
        return animalService.findAll();
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
    public void submit(@RequestParam(name = "id") Integer id,
                       @RequestParam(name = "race") String race,
                       @RequestParam(name = "age") Integer age,
                       @RequestParam(name = "gender") String sex,
                       @RequestParam(name = "description") String description) {
        Animal animal = new Animal();
        animal.setRace(race);
        animal.setAge(age);
        animal.setSex(sex);
        animal.setDescription(description);
        animalService.saveAnimal(animal);
    }

}
