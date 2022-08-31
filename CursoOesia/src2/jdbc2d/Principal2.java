package jdbc2d;

import java.util.List;

import jdbc2c.models.Compra;
import jdbc2c.models.Persona;
import jdbc2c.repositories.PersonaRepository;

public class Principal2 {

	public static void main(String[] args) {
		PersonaRepository repositorio = new PersonaRepository();

		List<Persona> lista = repositorio.buscarTodoCompras();
		for (Persona p : lista) {

			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			for (Compra c : p.getCompras()) {

				System.out.println(c.getConcepto());
			}
		}
	}
}
