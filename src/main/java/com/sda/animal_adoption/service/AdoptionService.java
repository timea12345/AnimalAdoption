package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AdoptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptionService {

    AdoptionRepository adoptionRepository;

    @Autowired
    public AdoptionService(AdoptionRepository adoptionRepository) {
        this.adoptionRepository = adoptionRepository;
    }


}
