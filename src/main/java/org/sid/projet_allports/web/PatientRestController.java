package org.sid.projet_allports.web;

import org.sid.projet_allports.entities.Patient;
import org.sid.projet_allports.repositories.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class PatientRestController {
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> patients(){
        return patientRepository.findAll();
    }
    @GetMapping("/patients/{id}")
    public Patient PatientById(Long id){
        return patientRepository.findById(id).get();
    }
    @PostMapping("/patients")
    public Patient save(Patient p){
        return patientRepository.save(p);
    }
}
