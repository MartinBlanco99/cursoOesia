package jdbc2c;

import java.util.List;

import jdbc2c.models.Persona;
import jdbc2c.repositories.PersonaRepository;

public class Principal2 {

	public static void main(String[] args) {
		PersonaRepository repositorio = new PersonaRepository();
		List<Persona> lista = repositorio.buscarTodos();
		for(Persona p : lista ) {
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		}

	}

}
