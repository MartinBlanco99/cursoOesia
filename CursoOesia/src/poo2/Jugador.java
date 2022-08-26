package poo2;

public class Jugador {

	private String nombre;
	private int numero;
	private int edad;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Jugador(String nombre, int numero,int edad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.edad=edad;
	}
	
	
}
