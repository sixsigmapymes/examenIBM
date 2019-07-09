package com.examen.test.app;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.examen.service.persona.PersonaService;

@Profile("test")
@Configuration
public class PersonaServiceTestConfiguration {
   @Bean
   @Primary
   public PersonaService personaService() {
      return Mockito.mock(PersonaService.class);
   }
}