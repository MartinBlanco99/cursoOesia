package arquitecturajava.proyecto1.models;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p;
	Persona p2;
	Persona p3;

	@BeforeEach
	public void setUp() {
		p = new Persona("pepe", 72);
		p2 = new Persona("rosa", 25);
		p3 = new Persona("rosa", 25);

	}

	@Test
	void estaJubuladoTest() {
		boolean estaJubilado = p.estaJubilado();
		assertEquals(true, estaJubilado);

		estaJubilado = p2.estaJubilado();
		assertEquals(false, estaJubilado);

	}
	
	@Test 
	public void noIgualdadPersonaTest() {
		assertNotEquals(p, p2);
	}
	
	@Test 
	public void igualdadPersonaTest() {
		assertEquals(p2, p3);
	}

}
