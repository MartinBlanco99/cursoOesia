package arquitecturajava.proyecto1.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

class PersonaServiceTest {

	@Test
	void buscarTodasLasPersonasMockTest() {
		IPersonaRepository repo = mock(IPersonaRepository.class);
		List<Persona> datosMock = Arrays.asList(new Persona("juan", 20), new Persona("maria", 30));
		when(repo.buscarTodos()).thenReturn(datosMock);

		PersonasService servicio = new PersonasService(repo);
		List<Persona> lista = servicio.buscarTodasLasPersonas();
		assertNotNull(lista);
		assertTrue(lista.size() > 1);

	}

}
