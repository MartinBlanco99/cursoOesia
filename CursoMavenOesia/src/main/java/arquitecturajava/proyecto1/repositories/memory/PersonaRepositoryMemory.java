package arquitecturajava.proyecto1.repositories.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

public class PersonaRepositoryMemory implements IPersonaRepository {

	private List<Persona> lista = new ArrayList<Persona>();

	public PersonaRepositoryMemory() {
		super();
	}

	public PersonaRepositoryMemory(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public List<Persona> buscarTodos() {
		return lista;
	}

	@Override
	public void insertar(Persona persona) {
		lista.add(persona);
	}

	@Override
	public void borrar(Persona persona) {
		lista.remove(persona);
	}

	@Override
	public Optional<Persona> buscarUno(String nombre) {
		return lista.stream().filter((p) -> p.getNombre().equals(nombre)).findFirst();

	}

}
