package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorFicheroTextoTest2 {

	GestorFicheroTexto fichero;

	@BeforeEach
	public void setUp() {
		try {
			fichero = new GestorFicheroTexto("fichero.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void numeroLineastTest() {

		assertEquals(3, fichero.getNumeroLineas());

	}

	@Test
	public void obtenerLineaTest() {

		assertEquals("Hoy es jueves", fichero.getLinea(1));

	}

	@Test
	public void contieneTextoTest() {

		assertTrue(fichero.contieneTexto("jueves"));

	}

}
