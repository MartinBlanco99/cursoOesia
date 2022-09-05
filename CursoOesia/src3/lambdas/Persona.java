package lambdas;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}

}
