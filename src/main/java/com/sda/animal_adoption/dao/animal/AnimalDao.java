package com.sda.animal_adoption.dao.animal;

import com.sda.animal_adoption.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalDao implements AnimalInterface {

    List<Animal> animals = new ArrayList<>();

    public void saveAnimal(Animal animal) {
        animals.add(animal);

    }

    @Override
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

    @Override
    public void update(Integer id, Animal animal) {
        for (Animal a: animals) {
            if (a.getId().equals(id)) {
                a.setAge(animal.getAge());
                a.setDescription(animal.getDescription());
                a.setPhoto(animal.getPhoto());
                a.setRace(animal.getRace());
                a.setSex(animal.getSex());
                a.setShelter(animal.getShelter());
            }
        }
    }

    @Override
    public List<Animal> findAll() {
        return this.animals;
    }

    @Override
    public void save(Animal animal) {

    }

    @Override
    public Animal findAnimal(Integer id) {
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        throw new NullPointerException("Animal id not found!");
    }
}
