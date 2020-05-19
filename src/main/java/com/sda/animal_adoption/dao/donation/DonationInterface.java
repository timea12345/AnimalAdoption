package com.sda.animal_adoption.dao.donation;

import com.sda.animal_adoption.model.Donation;
import java.util.List;

public interface DonationInterface {

    void save(Donation donation);
    void delete(Integer id);
    void update(Integer id, Donation donation);
    List<Donation> findAll();
    Donation findById(Integer id);

}
