package org.sid.projet_allports.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String desccription_diagnostic;
    public Patient(Long id,String name, String email, String desccription_diagnostic) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.desccription_diagnostic = desccription_diagnostic;

    }
}
