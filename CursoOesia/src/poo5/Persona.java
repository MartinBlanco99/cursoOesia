package poo5;

import java.util.Objects;

public class Persona {

	private String dni;
	private String nombre;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		System.out.println("llama al hashcode");
		return Objects.hash(dni, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("llama al equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}
	


}
