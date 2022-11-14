package com.liliana.controller;

import com.liliana.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.liliana.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/hi-patient")
    public String WelcomeDentist(){
        String hello = "Welcome, dear patient";
        return hello;
    }

    @GetMapping("/patients")
    private List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/patient/{patientId}")
    private Patient getPatient(@PathVariable("patientId") Integer patientId) {
        return patientService.getPatientById(patientId);
    }

    @DeleteMapping("/patient/{patientId}")
    private ResponseEntity deletePatient(@PathVariable("patientId") Integer patientId) {
        ResponseEntity response = null;

        if(patientId==null){
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            patientService.delete(patientId);
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return response;
    }

    @PostMapping("/patient")
    private Patient savePatient(@RequestBody Patient patient)
    {
        patientService.saveOrUpdate(patient);
        return patient;
    }

    @PutMapping("/patient")
    private Patient update(@RequestBody Patient patient)
    {
        patientService.saveOrUpdate(patient);
        return patient;
    }
}
