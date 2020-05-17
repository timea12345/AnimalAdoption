package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalService {

    private AnimalDao animalDao;

    @Autowired
    public AnimalService(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    public void saveAnimal(Animal animal) {
        animalDao.save(animal);
    }

    public void delete(Integer id) {
        animalDao.delete(id);
    }

    public List<Animal> findAll() {
        return animalDao.findAll();
    }

    public Animal findById(Integer id) {
        return animalDao.findAnimal(id);
    }
}
