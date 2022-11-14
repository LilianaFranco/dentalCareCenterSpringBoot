package com.liliana.controller;

import com.liliana.domain.Dentist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.liliana.services.DentistService;

import java.util.List;

@RestController
@RequestMapping("/dentists")
public class DentistController {
    @Autowired
    private DentistService dentistService;

    @GetMapping("/hi-dentist")
    public String WelcomeDentist(){
        String hello = "Welcome, dear dentist";
        return hello;
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
    private ResponseEntity deleteDentist(@PathVariable("dentistId") Integer dentistId) {
        ResponseEntity response = null;

        if(dentistId==null){
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            dentistService.delete(dentistId);
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return response;
    }

    @PostMapping("/dentist")
    private Dentist saveDentist(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist;
    }

    @PutMapping("/dentist")
    private Dentist update(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist;
    }
}
