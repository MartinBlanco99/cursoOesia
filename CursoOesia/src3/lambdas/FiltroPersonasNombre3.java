package lambdas;

import java.util.function.Predicate;

public class FiltroPersonasNombre3 implements Predicate<Persona> {

	private String nombre;

	public FiltroPersonasNombre3(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		return !persona.getNombre().equals(nombre);
	}

}
