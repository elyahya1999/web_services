
package org.sid.projet_allports.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.sid.projet_allports.dtos.PatientDto;
import org.sid.projet_allports.entities.Patient;
import org.sid.projet_allports.mapper.PatientMapper;
import org.sid.projet_allports.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientMapper patientMapper;

    public List<Patient> patientList()
    {
        return patientRepository.findAll();
    }
    @WebMethod
    public Patient patientById(@WebParam(name = "id") Long id)
    {
        return patientRepository.findById(id).get();
    }
    @WebMethod
    public Patient savePatient(@WebParam(name = "patient") PatientDto patientDto)
    {
        Patient patient=patientMapper.formPatientDtoToPatientEntity(patientDto);
        return patientRepository.save(patient);
    }

}

