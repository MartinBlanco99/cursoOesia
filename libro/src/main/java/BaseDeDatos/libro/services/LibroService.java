package BaseDeDatos.libro.services;

import java.util.List;

import BaseDeDatos.libro.model.Libro;
import BaseDeDatos.libro.repositories.ILibroRepository;

public class LibroService {

	private ILibroRepository iLibroRepository;

	public List<Libro> listarLibros() {
		return iLibroRepository.listarLibros();
	}

	public void insertar(Libro objectoLibro) {
		iLibroRepository.insertar(objectoLibro);
	}

}
