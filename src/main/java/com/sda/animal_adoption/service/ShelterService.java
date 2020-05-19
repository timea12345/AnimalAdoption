package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.shelter.ShelterRepository;
import com.sda.animal_adoption.model.Contract;
import com.sda.animal_adoption.model.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    private ShelterRepository shelterRepository;

    @Autowired
    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    public void save(Shelter shelter) {
        shelterRepository.save(shelter);
    }

    public void delete(Integer id) {
        shelterRepository.delete(findById(id));
    }

    public Shelter findById(Integer id) {
        return shelterRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Shelter not found!"));
    }

    public List<Shelter> findAll() {
        return shelterRepository.findAll();
    }
}
