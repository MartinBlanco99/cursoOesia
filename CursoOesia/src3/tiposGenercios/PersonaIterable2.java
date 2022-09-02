package tiposGenercios;

public class PersonaIterable2 implements Comparable<PersonaIterable2> {
	
	private String nombre;

	public PersonaIterable2(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(PersonaIterable2 o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	

}
