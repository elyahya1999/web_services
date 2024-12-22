package org.sid.projet_allports.mapper;

import org.modelmapper.ModelMapper;
import org.sid.projet_allports.dtos.PatientDto;
import org.sid.projet_allports.entities.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public Patient formPatientDtoToPatientEntity(PatientDto patientDto)
    {
        Patient patient= modelMapper.map(patientDto,Patient.class);
        return patient;
    }
}
