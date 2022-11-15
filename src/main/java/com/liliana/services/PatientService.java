package com.liliana.services;

import com.liliana.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.liliana.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<Patient>();
        patientRepository.findAll().forEach(patient1 -> patients.add(patient1));
        return patients;
    }

    public Patient getPatientById(Integer id){
        return patientRepository.findById(id).get();
    }

    public void save(Patient patient)
    {
        patientRepository.save(patient);
    }

    public void delete(Integer id)
    {
        patientRepository.deleteById(id);
    }

    public void update(Patient patient, Integer patientId){ patientRepository.save(patient);
    }

}
