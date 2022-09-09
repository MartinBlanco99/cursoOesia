package arquitecturajava.proyecto1.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;
import arquitecturajava.proyecto1.repositories.memory.PersonaRepositoryMemory;

class PersonaServiceTest {

	@Test
	void buscarTodasLasPersonasTest() {
		IPersonaRepository repo = new PersonaRepositoryMemory();
		PersonasService servicio = new PersonasService(repo);
		
		List<Persona> lista = servicio.buscarTodos();
		assertNotNull(lista);
		assertTrue(lista.size()>1);
		
	}

}
