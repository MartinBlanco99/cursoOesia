package jdbc4;

import java.util.List;

import jdbc4.models.Libro;
import jdbc4.repositories.LibroRepository;

public class Principal {

	public static void main(String[] args) {
		LibroRepository repositorio = new LibroRepository();

		List<Libro> lista = repositorio.listarLibros();
		for(Libro l : lista ) {
			System.out.println(l.getAutor());
			System.out.println(l.getTitulo());
		}
		//Libro l = new Libro(1, "1234", "libro 1", "martin");
		//repositorio.insertar(l);
		
		//Libro l2 = new Libro(2,"000", "libro2", "julian");
		//repositorio.insertar(l2);
		
		//Libro l3 = new Libro(3,"651", "libro 3", "rodolfo");
		//repositorio.insertar(l3);
		
		System.out.println();

		List<Libro> lista2 = repositorio.listarLibros();
		for (Libro libro : lista2) {
			System.out.println(libro.getId());
			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());

		}
	}

}
