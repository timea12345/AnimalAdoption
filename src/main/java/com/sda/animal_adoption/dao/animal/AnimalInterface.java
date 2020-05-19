package com.sda.animal_adoption.dao.animal;

import com.sda.animal_adoption.model.Animal;
import java.util.List;

public interface AnimalInterface {

    Animal findAnimal(Integer id);
    List<Animal> findAll();
    void save(Animal animal);
    void delete(Integer id);
    void update(Integer id, Animal animal);

}
