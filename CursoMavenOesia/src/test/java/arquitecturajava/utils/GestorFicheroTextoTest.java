package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class GestorFicheroTextoTest {

	@Test
	public void numeroLineastTest() {
		try {
			GestorFicheroTexto fichero = new GestorFicheroTexto("fichero.txt");
			assertEquals(3, fichero.getNumeroLineas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void obtenerLineaTest() {
		try {
			GestorFicheroTexto fichero = new GestorFicheroTexto("fichero.txt");
			assertEquals("Hoy es jueves", fichero.getLinea(1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void contieneTextoTest() {
		try {
			GestorFicheroTexto fichero = new GestorFicheroTexto("fichero.txt");
			assertTrue( fichero.contieneTexto("jueves"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
