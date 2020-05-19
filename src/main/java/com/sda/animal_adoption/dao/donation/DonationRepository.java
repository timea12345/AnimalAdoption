package com.sda.animal_adoption.dao.donation;

import com.sda.animal_adoption.model.Donation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Integer> {

    List<Donation> findAll();
    Optional<Donation> findById(Integer id);

}
