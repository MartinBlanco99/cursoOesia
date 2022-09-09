package arquitecturajava.proyecto1.services;

import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

public class PersonaService {

	private IPersonaRepository repositorio;

	public PersonaService(IPersonaRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}

	public List<Persona> buscarTodasLasPersonas() {
		return repositorio.buscarTodos();
	}

	public void insertarPersona(Persona persona) {
		repositorio.insertar(persona);
	}

	public void borrarPersona(Persona persona) {
		repositorio.borrar(persona);
	}

	public Optional<Persona> buscarUno(String nombre) {
		return repositorio.buscarUno(nombre);
	}

	

}
