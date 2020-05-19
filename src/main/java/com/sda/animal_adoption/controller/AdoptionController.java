package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Adoption;
import com.sda.animal_adoption.service.AdoptionService;
import com.sda.animal_adoption.service.AnimalService;
import com.sda.animal_adoption.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    private AdoptionService adoptionService;
    private UserService userService;
    private AnimalService animalService;

    @Autowired
    public AdoptionController(AdoptionService adoptionService,
                              UserService userService,
                              AnimalService animalService) {
        this.adoptionService = adoptionService;
        this.userService = userService;
        this.animalService = animalService;
    }

    @PostMapping("/createAdoption")
    @CrossOrigin("*")
    public void createAdoption(@RequestParam(name = "idUser") Integer idUser,
                               @RequestParam(name = "idAnimal") Integer idAnimal) {
        Adoption adoption = new Adoption();
        adoption.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        adoption.setUser(userService.findById(idUser));
        adoption.setAnimal(animalService.findById(idAnimal));
        adoptionService.save(adoption);
    }

}
