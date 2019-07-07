TEST TECNIO

	Implementar una solución que exponga recursos para manejar una entidad Persona con las siguientes características
 (todos los atributos son requeridos):
										ID (numérico)
										Nombre
										Apellido
										Edad
										Sexo
										
	REQUERIMIENTO:
	
				1) Listado de personas: GET localhost:port/personas (retorna un JSON con todas las personas)
				2) Alta de persona: POST localhost:port/personas (crea una persona nueva)
				3) (EXTRA/PLUS) Implementar los recursos PUT y DELETE
				
	Consideraciones:
				Utilizar Java 8
				Armar un proyecto con maven
				Utilizar JPA
				Utilizar la DB en memoria hsqldb
				Armar los Junit que se crean necesarios
				Tener en cuenta manejo de excepciones con jerarquías
				Publicar el proyecto en github o bitbucket y enviar el link.
---------------------------------------------------------------------------------------------------------				
I. ENTORNO DE DESARROLLO

	IDE: Eclipse Java EE IDE for Web Developers Oxygen.3a Release
	JVM :Java JDK 1.8
	FWRK : Spring boot
	SISTEMA OPERATIVO: Windows 8
	SOFTWARE ADICIONAL: Apache Maven 3.3.9.

II.	DESARROLLO
        Se diseño como una app. autocontenida ,
utilizando el framework de springboot ; para la implementacion
de la persistenca (JPA ) repository .Los servicios REST se implementaron con swagger y
 en pom del proyecto se agrrgaron ,las dependencias necesarias; para implementarlo como API,
con el ojetivo de publicarlos en internet 
, para ser consumido en otras aplicaciones.
