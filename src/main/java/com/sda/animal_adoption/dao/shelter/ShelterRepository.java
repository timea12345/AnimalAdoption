package com.sda.animal_adoption.dao.shelter;

import com.sda.animal_adoption.model.Shelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShelterRepository extends CrudRepository<Shelter, Integer> {

    List<Shelter> findAll();
    Optional<Shelter> findById(Integer id);

}
