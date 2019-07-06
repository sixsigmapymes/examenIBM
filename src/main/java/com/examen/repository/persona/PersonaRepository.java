package com.examen.repository.persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.persona.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{

	
 
}