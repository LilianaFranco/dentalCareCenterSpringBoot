package com.liliana.controller;

import com.liliana.domain.Dentist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.liliana.services.DentistService;

import java.util.List;


@RestController
public class DentistController {

    @Autowired
    private DentistService dentistService;


    @GetMapping("/dentist")
    public String WelcomeDentist(){
        String mostrar = "Welcome, dear dentist";
        return mostrar;
    }

    @GetMapping("/dentists")
    private List<Dentist> getAllDentists() {
        return dentistService.getAllDentists();
    }

    @GetMapping("/dentist/{dentistId}")
    private Dentist getDentist(@PathVariable("dentistId") Integer dentistId) {
        return dentistService.getDentistById(dentistId);
    }

    @DeleteMapping("/dentist/{dentistId}")
    private void deleteDentist(@PathVariable("dentistId") Integer dentistId)
    {
        dentistService.delete(dentistId);
    }

    @PostMapping("/dentists")
    private int saveDentist(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist.getId();
    }

    @PutMapping("/dentist")
    private Dentist update(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist;
    }
}
