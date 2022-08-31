package jdbc2d.repositories;

import java.util.List;

import jdbc2c.models.Persona;

public interface IPersonaRepository {

	List<Persona> buscarTodos();

	void insertar(Persona p);

	void borrar(Persona p);

	Persona buscarUna(String dni);

}