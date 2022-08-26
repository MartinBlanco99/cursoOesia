package poo;

public class Persona {

	private String nombre;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean estaJubilado() {
		
		return edad>65;
	}
	
	public boolean esMayor(Persona otra) {
		
		return getEdad()>otra.getEdad();
	}
	
	
}
