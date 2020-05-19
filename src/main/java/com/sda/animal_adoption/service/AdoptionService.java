package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.adoption.AdoptionRepository;
import com.sda.animal_adoption.model.Adoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionService {

    private AdoptionRepository adoptionRepository;

    @Autowired
    public AdoptionService(AdoptionRepository adoptionRepository) {
        this.adoptionRepository = adoptionRepository;
    }

    public void save(Adoption adoption) {
        adoptionRepository.save(adoption);
    }

    public List<Adoption> findAll() {
        return adoptionRepository.findAll();
    }

    public Adoption findById(Integer id) {
        return adoptionRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Adoption not found!"));
    }

    public void delete(Integer id) {
        adoptionRepository.delete(findById(id));
    }

}
