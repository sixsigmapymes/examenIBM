package com.examen.entity.persona;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Srozenebrg
 *
 */
@Entity
@Table(name="PERSONA")
public class Persona {
  
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 @NotNull
 private Long id;
 @Column(name="NOMBRE")
 @NotNull
 private String nombre;
 @Column(name="APELLIDO")
 @NotNull
 private String apellido;
 @Column(name="EDAD")
 @NotNull
 private Short edad;
 @Column(name="SEXO")
 @NotNull
 private String sexo;
 
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the apellido
 */
public String getApellido() {
	return apellido;
}
/**
 * @param apellido the apellido to set
 */
public void setApellido(String apellido) {
	this.apellido = apellido;
}
/**
 * @return the edad
 */
public Short getEdad() {
	return edad;
}
/**
 * @param edad the edad to set
 */
public void setEdad(Short edad) {
	this.edad = edad;
}
/**
 * @return the sexo
 */
public String getSexo() {
	return sexo;
}
/**
 * @param sexo the sexo to set
 */
public void setSexo(String sexo) {
	this.sexo = sexo;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return"[{"+this.nombre+","+this.apellido+","+this.edad+","+this.sexo+"}]";
}

}