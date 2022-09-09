package arquitecturajava.proyecto1.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import arquitecturajava.proyecto1.models.Persona;
import arquitecturajava.proyecto1.repositories.IPersonaRepository;

@ExtendWith(MockitoExtension.class)
class PersonaServiceTest {

	PersonaService servicio;
	@Mock
	IPersonaRepository repositorio;

	@BeforeEach
	public void setUp() {
		repositorio = mock(IPersonaRepository.class);
		servicio = new PersonaService(repositorio);

	}

	@Test
	void buscarTodasLasPersonasMockTest() {
		List<Persona> datosMock = Arrays.asList(new Persona("juan", 20), new Persona("maria", 30));
		when(repositorio.buscarTodos()).thenReturn(datosMock);

		List<Persona> lista = servicio.buscarTodasLasPersonas();
		assertNotNull(lista);
		assertTrue(lista.contains(new Persona("juan", 20)));
		assertTrue(lista.contains(new Persona("maria", 30)));
	}

	@Test
	public void insertarPersonaTest() {
		servicio.insertarPersona(new Persona("juan", 30));

		// verifico la delegacion en el otro objeto que es lo que implementa el servicoi
		// y nada mas
		verify(repositorio).insertar(any(Persona.class));
	}
	
	@Test
	public void borrarPersonaTest() {
		
		
		servicio.borrarPersona(new Persona("juan"));
		
		//verifico la delegacion en el otro objeto que es lo que implementa el servicoi
		//y nada mas
		verify(repositorio).borrar(any(Persona.class));
	}

}
