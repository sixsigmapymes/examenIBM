/**
 * 
 */
package com.examen.service.persona;

import java.util.List;

import com.examen.entity.persona.Persona;

/**
 * @author srozenberg
 *
 */
public interface PersonaService {

	List<Persona> ListadoPersonas();
	
	void altaPersona(Persona persona);

	void bajaPersona(Long personaId);

	void updatePersona(Persona persona);
	
	Persona getPersona(Long personaId);

}
