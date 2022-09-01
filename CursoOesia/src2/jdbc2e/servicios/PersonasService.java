package jdbc2e.servicios;

import java.util.List;


import jdbc2e.models.Compra;
import jdbc2e.models.Persona;
import jdbc2e.repositories.ICompraRepository;
import jdbc2e.repositories.IPersonaRepository;

public class PersonasService {
	private IPersonaRepository personaRepositorio;
	private ICompraRepository compraRepositorio;
	
	public PersonasService(IPersonaRepository personaRepositorio, ICompraRepository compraRepositorio) {
		super();
		this.personaRepositorio = personaRepositorio;
		this.compraRepositorio = compraRepositorio;
	}

	public List<Persona> buscarTodosLasPersonas() {
		return personaRepositorio.buscarTodos();
	}

	public List<Persona> buscarTodosLasPersonasConCompras() {
		return personaRepositorio.buscarTodosConCompras();
	}

	public Persona buscarUnaPersona(String dni) {
		return personaRepositorio.buscarUna(dni);
	}

	public void insertarPersona(Persona p) {
		personaRepositorio.insertar(p);
	}

	public void borrarPersona(Persona p) {
		personaRepositorio.borrar(p);
	}

	public void insertarCompra(Compra compra) {
		compraRepositorio.insertar(compra);
	}

	public void borrarCompra(Compra compra) {
		compraRepositorio.borrar(compra);
	}

}
