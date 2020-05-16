package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalDao {

    List<Animal> animals = new ArrayList<>();

    public void save(Animal animal) {
        animals.add(animal);
    }

    public void delete(Integer id) {
        int index = -1;

        for (int i = 0; i<animals.size(); i++) {
            if (animals.get(i).getId() != null && animals.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        if (index != -1) {
            animals.remove(index);
            System.out.println(animals);
        }
    }

    public List<Animal> findAll() {
        return this.animals;
    }

    public Animal findAnimal(Integer id) {
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        throw new NullPointerException("Animal id not found!");
    }
}
