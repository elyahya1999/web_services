package org.sid.projet_allports.web;

import lombok.AllArgsConstructor;
import org.sid.projet_allports.dtos.PatientDto;
import org.sid.projet_allports.entities.Patient;
import org.sid.projet_allports.mapper.PatientMapper;
import org.sid.projet_allports.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientGraphQLController {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientMapper patientMapper;
    @QueryMapping
    public List<Patient> allPatients() {
        return patientRepository.findAll();
    }
    @QueryMapping
    public Patient patientById(@Argument Long id) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if(patient == null)
            throw new RuntimeException(String.format("Patient %s not found",id));
        return patient;
    }
    @MutationMapping
    public Patient savePatient(@Argument PatientDto patient) {
        Patient c=patientMapper.formPatientDtoToPatientEntity(patient);
        return patientRepository.save(c);
    }
}
