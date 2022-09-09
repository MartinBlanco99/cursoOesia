package arquitecturajava.proyecto1.services;

import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

public class PersonasService {
	
	private IPersonaRepository repositorio;

	public PersonasService(IPersonaRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}

	public List<Persona> buscarTodos() {
		return repositorio.buscarTodos();
	}

	public void insertar(Persona persona) {
		repositorio.insertar(persona);
	}

	public void borrar(Persona persona) {
		repositorio.borrar(persona);
	}

	public Optional<Persona> buscarUno(String nombre) {
		return repositorio.buscarUno(nombre);
	}
	
	

}
