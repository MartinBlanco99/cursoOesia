package BaseDeDatos.libro.repositories;

import java.util.List;

import BaseDeDatos.libro.model.Libro;

public interface ILibroRepository {
	
	List<Libro> listarLibros();
	
	void insertar(Libro libro);

}
