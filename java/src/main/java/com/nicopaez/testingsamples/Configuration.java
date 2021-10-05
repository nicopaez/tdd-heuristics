package com.nicopaez.testingsamples;

import com.nicopaez.testingsamples.domain.SemaforoDeTemperatura;
import org.springframework.context.annotation.Bean;

// https://docs.spring.io/spring-boot/docs/2.0.0.M3/reference/html/boot-features-developing-auto-configuration.html
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public SemaforoDeTemperatura semaforo() {
        return new SemaforoDeTemperatura();
    }
}
