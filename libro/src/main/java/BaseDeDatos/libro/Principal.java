package BaseDeDatos.libro;

import java.util.List;

import BaseDeDatos.libro.model.Libro;
import BaseDeDatos.libro.repositories.ILibroRepository;
import BaseDeDatos.libro.repositories.jdbc.LibroRepository;

public class Principal {
	public static void main(String[] args) {

		ILibroRepository iLibroRepository = new LibroRepository();

// 		iLibroRepository.insertar(new Libro(1, "Libro 1", "Autor 1"));
//		iLibroRepository.insertar(new Libro(2, "Libro 2", "Autor 2"));
//		iLibroRepository.insertar(new Libro(3, "Libro 3", "Autor 3"));
//		iLibroRepository.insertar(new Libro(4, "Libro 4", "Autor 4"));
//		iLibroRepository.insertar(new Libro(5, "Libro 5", "Autor 5"));
//		iLibroRepository.insertar(new Libro(6, "Libro 6", "Autor 6"));
//		iLibroRepository.insertar(new Libro(7, "Libro 7", "Autor 7"));

		List<Libro> listaLibro = iLibroRepository.listarLibros();

		for (Libro l : listaLibro) {
			System.out.println("ISBN: " + l.getIsbn() + " -Titulo: " + l.getTitulo() + " -Autor: " + l.getAutor());
		}
	}
}
