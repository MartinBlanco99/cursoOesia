package jdbc2e;

import java.util.List;

import jdbc2e.repositories.ICompraRepository;
import jdbc2e.repositories.IPersonaRepository;
import jdbc2e.models.Compra;
import jdbc2e.models.Persona;
import jdbc2e.repositories.jdbc.CompraRepositoryJDBC;
import jdbc2e.repositories.jdbc.PersonaRepositoryJDBC;
import jdbc2e.servicios.PersonasService;

public class Principal {

	public static void main(String[] args) {
		IPersonaRepository repoP = new PersonaRepositoryJDBC();
		ICompraRepository repoC = new CompraRepositoryJDBC();

		PersonasService servicio = new PersonasService(repoP, repoC);
		System.out.println("*******************");
		List<Persona> lista = servicio.buscarTodosLasPersonasConCompras();
		for (Persona p : lista) {

			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			for (Compra c : p.getCompras()) {

				System.out.println(c.getConcepto());
			}
		}

	}
}
