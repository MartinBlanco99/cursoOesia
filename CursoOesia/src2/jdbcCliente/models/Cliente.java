package jdbcCliente.models;

public class Cliente {
	private int dni;
	private String nombre;

	public Cliente() {
		super();
	}

	public Cliente(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
