package lambdas;

public class FiltroPersonasNombre2 implements Filtro<Persona> {

	private String nombre;

	public FiltroPersonasNombre2(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public boolean filtrar(Persona persona) {
		return !persona.getNombre().equals(nombre);
	}

}
