package com.examen.mensajes.persona;

/**
 * @author srozenberg
 *
 */
public class StatusOp {
	
	/**
	 * @return : Error Id persona
	 * @throws Exception
	 */
	public String errorId() throws Exception {
		throw new Exception("Error Id de la persona !!");
	}
	
	/**
	 * @return: No hay personas en la base
	 * @throws Exception
	 */
	public String listadoPersonaVacio() throws Exception {
		throw new Exception("No existen persona en la base!!");
	}
	/**
	 * @return: No hay personas en la base
	 * @throws Exception
	 */
	public String errorBaja() throws Exception {
		throw new Exception("No existen persona en la base!!");
	}
}
