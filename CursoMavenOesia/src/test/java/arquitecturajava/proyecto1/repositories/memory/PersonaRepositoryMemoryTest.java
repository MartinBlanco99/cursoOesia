package arquitecturajava.proyecto1.repositories.memory;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

class PersonaRepositoryMemoryTest {

	IPersonaRepository repo;

	@BeforeEach
	public void setUp() {
		repo = new PersonaRepositoryMemory();
	}

	@Test
	void buscarTodosTest() {
		List<Persona> lista = repo.buscarTodos();
		assertNotNull(lista);
		assertTrue(lista.size() > 1);
	}

	@Test
	public void insertarPersonaTest() {
		Persona p = new Persona("juan", 20);
		repo.insertar(p);
		List<Persona> lista2 = repo.buscarTodos();
		assertTrue(lista2.contains(p));

	}

	@Test
	public void borrarPersonaTest() {
		List<Persona> lista = repo.buscarTodos();
		int total = lista.size();
		repo.borrar(new Persona("nando", 26));
		List<Persona> lista2 = repo.buscarTodos();
		assertEquals(total, lista2.size());

	}

	@Test
	public void buscarUnoTest() {
		Optional<Persona> oPersona = repo.buscarUno("luis");
		assertFalse(oPersona.isPresent());
		if (oPersona.isPresent()) {
			Persona p = oPersona.get();
			assertEquals(new Persona("luis", 26), p);
		}

		Optional<Persona> oPersona2 = repo.buscarUno("mario");
		assertFalse(oPersona2.isPresent());

	}

}
