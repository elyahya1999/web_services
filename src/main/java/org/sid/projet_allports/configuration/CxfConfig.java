package org.sid.projet_allports.configuration;

import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.sid.projet_allports.web.PatientSoapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@AllArgsConstructor
public class CxfConfig {

    private  Bus bus;
    private  PatientSoapService patientSoapService;

    @Bean
    public EndpointImpl endpoint() {
        if (patientSoapService == null) {
            throw new IllegalStateException("PatientSoapService bean is not initialized!");
        }
        EndpointImpl endpoint = new EndpointImpl(bus, patientSoapService);
        endpoint.publish("/patientManagementService");
        return endpoint;
    }
}


