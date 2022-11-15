package com.liliana.controller;

import com.liliana.domain.Patient;
import com.liliana.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/allPatients")
    private List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{patientId}")
    private Patient getPatient(@PathVariable("patientId") Integer id) {
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{patientId}")
    private ResponseEntity deletePatient(@PathVariable("patientId") Integer id) {
        ResponseEntity response = null;

        if(id==null){
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            patientService.delete(id);
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return response;
    }

    @PostMapping("/")
    private Patient savePatient(@RequestBody Patient patient)
    {
        patientService.save(patient);
        return patient;
    }

    @PutMapping("/patient")
    private Patient update(@RequestBody Patient patient)
    {
        patientService.save(patient);
        return patient;
    }
}
