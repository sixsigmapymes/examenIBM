package com.examen.controller.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.persona.Persona;

import com.examen.mensajes.persona.StatusOp;
import com.examen.service.persona.PersonaService;;

/**
 * @author srozenberg
 *
 */
@RestController
public class PersonaRestController {

	private StatusOp status;
	@Autowired
	private PersonaService personaService;

	/**
	 * @param personaService
	 */
	public void setPersonaService(PersonaService personaService) {
		this.personaService = personaService;
	}

	/**
	 * @return Listado de persona completo
	 */
	@GetMapping("/api/personas")
	public List<Persona> getPersonas() {
		List<Persona> personas = personaService.ListadoPersonas();
		try {
			if (personas.size()== 0)
				status.listadoPersonaVacio();
			return personas;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@GetMapping("/api/personas/{personaId}")
	public Persona getPersona(@PathVariable(name = "personaId") Long personaId) {

		try {
			if (personaId <= 0)
				status.errorId();
			return personaService.getPersona(personaId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@PostMapping("/api/persona")
	public void savePersona(Persona Persona) throws Exception {

		try {
			personaService.altaPersona(Persona);
		} catch (Exception e) {
			throw new Exception("No se dio de alta la persona en la base!!");
		}
	}

	@DeleteMapping("/api/persona/{personaId}")
	public void deletePersona(@PathVariable(name = "personaId") Long personaId) {
		personaService.bajaPersona(personaId);
		System.out.println("Persona Deleted Successfully");
	}

	@PutMapping("/api/personas/{personaId}")
	public void updatePersona(@RequestBody Persona persona, @PathVariable(name = "personaId") Long personaId) throws Exception {
		Persona emp = personaService.getPersona(personaId);
		try {
		personaService.updatePersona(persona);
		} catch (Exception e) {
			throw new Exception("No se actualizo la persona en la base!!");
		}
	}

}