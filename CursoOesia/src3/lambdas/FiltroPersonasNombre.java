package lambdas;

public class FiltroPersonasNombre implements FiltroPersonas {

	private String nombre;

	public FiltroPersonasNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public boolean filtrar(Persona persona) {
		return !persona.getNombre().equals(nombre);
	}

}
