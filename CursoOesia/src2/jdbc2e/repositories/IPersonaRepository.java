package jdbc2e.repositories;

import java.util.List;

import jdbc2e.models.Persona;

public interface IPersonaRepository {
	List<Persona> buscarTodos();

	List<Persona> buscarTodosConCompras();

	Persona buscarUna(String dni);

	void insertar(Persona p);

	void borrar(Persona p);

	double calcularEdadMedia();

	//void countEdad();

	double edadMinima();

	double edadMaxima();

}