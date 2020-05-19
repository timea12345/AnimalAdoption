//package com.sda.animal_adoption.dao.animal;
//
//import com.sda.animal_adoption.model.Animal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class AnimalRepositoryImpl implements AnimalInterface {
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
//
//    @Override
//    public Animal findAnimal(Integer id) {
//        return animalRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Animal not found!"));
//    }
//
//    @Override
//    public List<Animal> findAll() {
//        return animalRepository.findAll();
//    }
//
//    @Override
//    public void save(Animal animal) {
//        animalRepository.save(animal);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        animalRepository.delete(findAnimal(id));
//    }
//
//    @Override
//    public void update(Integer id, Animal animal) {
//        animalRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Animal not found!"))
//                .setRace(animal.getRace());
//        animalRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Animal not found!"))
//                .setDescription(animal.getDescription());
//        animalRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Animal not found!"))
//                .setSex(animal.getSex());
//        animalRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("Animal not found!"))
//                .setAge(animal.getAge());
//    }
//}
