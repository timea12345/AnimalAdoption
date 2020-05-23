package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Shelter;
import com.sda.animal_adoption.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shelter")
public class ShelterController {

    private ShelterService shelterService;

    @Autowired
    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    @GetMapping("/list")
    @CrossOrigin("*")
    public List<Shelter> findAll() {
        return shelterService.findAll();
    }

    @PostMapping("/addShelter")
    @CrossOrigin("*")
    public void submit(@RequestBody Shelter shelter) {
        shelterService.save(shelter);
    }

}

