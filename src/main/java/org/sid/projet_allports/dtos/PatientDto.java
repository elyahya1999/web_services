package org.sid.projet_allports.dtos;

import lombok.Data;

@Data
public class PatientDto {
    private int id;
    private String name;
    private String email;
    private String desccription_diagnostic;
}
