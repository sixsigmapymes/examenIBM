/**
 * 
 */
package com.examen.service.persona;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.entity.persona.Persona;
import com.examen.repository.persona.PersonaRepository;

/**
 * @author srozenberg
 *
 */
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public void setPersonaRepository(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	@Override
	public List<Persona> ListadoPersonas() {
		List<Persona> personas = personaRepository.findAll();
		return personas;
	}

	@Override
	public void altaPersona(Persona persona) {
		personaRepository.save(persona);
	}

	@Override
	public void bajaPersona(Long personaId) {
		
		personaRepository.deleteById(personaId);
	}

	@Override
	public void updatePersona(Persona persona) {
		personaRepository.save(persona);
	}

	@Override
	public Persona getPersona(Long personaId) {
	   Optional<Persona> optEmp = personaRepository.findById(personaId);
        	return optEmp.get();
	}
}
