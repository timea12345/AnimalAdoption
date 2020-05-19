package com.sda.animal_adoption.dao.shelter;

import com.sda.animal_adoption.model.Shelter;
import java.util.List;

public interface ShelterInterface {

    void save(Shelter shelter);
    Shelter findById(Integer id);
    List<Shelter> findAll();
    void delete(Integer id);
    void update(Integer id, Shelter newShelter);

}
