package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.service.Population;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManagementController {

    private Population population;

    public ManagementController(Population population) {
        this.population = population;
    }

    @PostMapping("/saveData")
    public void saveData() {
        population.saveData();
    }

}
