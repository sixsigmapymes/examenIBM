/**
 * 
 */
package com.examen.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.examen.ibm.entity.persona.Persona;
import com.examen.ibm.service.rest.persona.PersonaRestController;

/**
 * @author srozenberg
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(PersonaRestController.class)
public class PersonaRestControllerTest extends AbstractTest {

	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	   @Test
	   public void getPersonaList() throws Exception {
	      String uri = "/personas";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Persona[] personalist = super.mapFromJson(content, Persona[].class);
	      assertTrue(personalist.length > 0);
	   }
	   @Test
	   public void createPersona() throws Exception {
	      String uri = "/persona";
	      Persona persona = new Persona();
			persona.setId((long) 1000);
			persona.setNombre("Nombre1");
			persona.setApellido("Apellido1");
			persona.setEdad((short) 18);
			persona.setSexo("MASCULINO");
	      String inputJson = super.mapToJson(persona);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(201, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Perosna Creada");
	   }
	   @Test
	   public void updateProduct() throws Exception {
	      String uri = "/persona/1000";
	      Persona persona = new Persona();
	      persona.setNombre("Nuevo");
	      String inputJson = super.mapToJson(persona);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Persona Actualizada correctamente");
	   }
	   @Test
	   public void deleteProduct() throws Exception {
	      String uri = "/products/1000";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Persona eliminada correctamente");
	   }
	}
