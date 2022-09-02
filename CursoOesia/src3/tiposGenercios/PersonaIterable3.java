package tiposGenercios;

public class PersonaIterable3 implements Comparable<PersonaIterable3> {

	private String nombre;
	private int edad;

	public PersonaIterable3(String nombre) {
		super();
		this.nombre = nombre;
	}

	public PersonaIterable3(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

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

	@Override
	public int compareTo(PersonaIterable3 o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}

}
