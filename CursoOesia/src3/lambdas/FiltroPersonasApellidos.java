package lambdas;

public class FiltroPersonasApellidos implements FiltroPersonas {

	private String apellidos;

	public FiltroPersonasApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}

	@Override
	public boolean filtrar(Persona persona) {
		return !persona.getApellidos().equals(apellidos);
	}

}
