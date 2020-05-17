//package com.sda.animal_adoption.dao;
//
//import com.sda.animal_adoption.model.Animal;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class AnimalRepositoryImpl implements MyAnimalInterface {
//
//    private AnimalRepository animalRepository;
//
//    @Autowired
//    public AnimalRepositoryImpl(AnimalRepository animalRepository) {
//        this.animalRepository = animalRepository;
//    }
//
//    public Animal getAnimal() {
//        return animalRepository.findById(1).orElse(new Animal());
//    }
//}
