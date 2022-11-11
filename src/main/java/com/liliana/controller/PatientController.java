package com.liliana.controller;

import com.liliana.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.liliana.services.PatientService;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient")
    public String WelcomeDentist(){
        return "Welcome, dear dentist";
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
    private void deletePatient(@PathVariable("patientId") Integer patientId)
    {
        patientService.delete(patientId);
    }

    @PostMapping("/patients")
    private int savePatient(@RequestBody Patient patient)
    {
        patientService.saveOrUpdate(patient);
        return patient.getId();
    }

    @PutMapping("patients")
    private Patient update(@RequestBody Patient patient)
    {
        patientService.saveOrUpdate(patient);
        return patient;
    }
}
