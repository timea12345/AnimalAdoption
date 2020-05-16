package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    @Query
    List<Animal> findAll();

}
