package org.sid.projet_allports.repositories;

import org.sid.projet_allports.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Patient,Long> {
}
