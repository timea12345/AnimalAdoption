package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.animal.AnimalRepository;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void saveAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void delete(Integer id) {
        animalRepository.delete(findById(id));
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Integer id) {
        return animalRepository.findById(id).orElseThrow(() ->new NullPointerException("animal not found"));
    }

    public void update(Integer id, Animal animal) {
        animalRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Animal not found!"))
                .setRace(animal.getRace());
        animalRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Animal not found!"))
                .setDescription(animal.getDescription());
        animalRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Animal not found!"))
                .setSex(animal.getSex());
        animalRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Animal not found!"))
                .setAge(animal.getAge());
    }
}
