package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.dao.AdoptionRepository;
import com.sda.animal_adoption.dao.AnimalRepository;
import com.sda.animal_adoption.dao.user.UserRepository;
import com.sda.animal_adoption.model.Adoption;
import com.sda.animal_adoption.service.AdoptionService;
import com.sda.animal_adoption.service.AnimalService;
import com.sda.animal_adoption.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    private AdoptionRepository adoptionRepository;
    private UserRepository userRepository;
    private AnimalRepository animalRepository;

    @Autowired
    public AdoptionController(AdoptionRepository adoptionRepository, UserRepository userRepository, AnimalRepository animalRepository) {
        this.adoptionRepository = adoptionRepository;
        this.userRepository = userRepository;
        this.animalRepository = animalRepository;
    }

    @PostMapping("/createAdoption")
    @CrossOrigin("*")
    public void createAdoption(@RequestParam(name = "idUser") Integer idUser, @RequestParam(name = "idAnimal") Integer idAnimal) {
        Adoption adoption = new Adoption();
        adoption.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        adoption.setUser(userRepository.findById(idUser).get());
        adoption.setAnimal(animalRepository.findById(idAnimal).get());
        adoptionRepository.save(adoption);
    }

}
