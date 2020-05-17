package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AdoptionRepository;
import com.sda.animal_adoption.model.Adoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptionService {

    AdoptionRepository adoptionRepository;

    @Autowired
    public AdoptionService(AdoptionRepository adoptionRepository) {
        this.adoptionRepository = adoptionRepository;
    }

    public void save(Adoption adoption) {
        adoptionRepository.save(adoption);
    }

}
