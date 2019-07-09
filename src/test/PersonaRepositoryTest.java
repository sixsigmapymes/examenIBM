package com.examen.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import java.util.Optional;

import javax.persistence.Tuple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.examen.entity.persona.Persona;
import com.examen.repository.persona.PersonaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration("file:src/test/resources/applicationContext.xml")
// @Sql(scripts = { "sql/test.sql" })
public class PersonaRepositoryTest {

	

	@Autowired
	private PersonaRepository personaRepository;

	/**
	 * Verifico persistencia
	 */
	@Test
	public void testAltaListar() {
		initTest();
		assertTrue(personaRepository.findAll().size() != 0);
	}

	@Test
	public void testBaja() {
		Persona persona = new Persona();
		persona.setNombre("Nombre1");
		persona.setApellido("Apellido1");
		persona.setEdad((short) 18);
		persona.setSexo("MASCULINO");
		
		personaRepository.delete(persona);
		assertTrue(personaRepository.findById((long) 1)==null);
	}

	
	/***
	 * Genera Object Sets Para el test unitario
	 */
	private void initTest() {
		for (int i = 1; i == 10; i++) {
			Persona persona = new Persona();
			persona.setNombre("Nombre"+i);
			persona.setApellido("Apellido"+i);
			persona.setEdad((short) 18);
			persona.setSexo("MASCULINO");
			personaRepository.save(persona);
			
		}
	}
}