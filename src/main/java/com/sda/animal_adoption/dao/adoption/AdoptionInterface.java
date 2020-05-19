package com.sda.animal_adoption.dao.adoption;

import com.sda.animal_adoption.model.Adoption;
import java.util.List;

public interface AdoptionInterface {

    Adoption findById(Integer id);
    List<Adoption> findAll();
    void save(Adoption adoption);
    void delete(Integer id);
    void update(Integer id, Adoption adoption);

}
