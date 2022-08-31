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
		
		System.out.println();
		
		Persona p = new Persona("2000", "maria", "gomez",16,"brasil");
		repositorio.insertar(p);
		List<Persona> lista2 = repositorio.buscarTodos();
		for(Persona p2 : lista2 ) {
			System.out.println(p2.getNombre());
			System.out.println(p2.getApellidos());
		}

	}

}
