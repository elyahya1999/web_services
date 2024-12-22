package org.sid.projet_allports;

import org.sid.projet_allports.entities.Patient;
import org.sid.projet_allports.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetAllportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetAllportsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository)
    {
        return args -> {
            patientRepository.save(new Patient(0L,"hassan", "hassan@mail.com", "check-up"));
            patientRepository.save(new Patient(1L,"zouhair", "zouahir@mail.com", "mrid"));
            patientRepository.save(new Patient(2L,"pipox", "pipox@mail.com", "maraj"));
            patientRepository.save(new Patient(3L,"hatim", "hatim@mail.com", "scanner"));
        };
    }
}
