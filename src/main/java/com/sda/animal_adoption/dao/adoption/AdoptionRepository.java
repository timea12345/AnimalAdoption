package com.sda.animal_adoption.dao.adoption;

import com.sda.animal_adoption.model.Adoption;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AdoptionRepository extends CrudRepository<Adoption, Integer> {

    List<Adoption> findAll();
    Optional<Adoption> findById(Integer id);

}
