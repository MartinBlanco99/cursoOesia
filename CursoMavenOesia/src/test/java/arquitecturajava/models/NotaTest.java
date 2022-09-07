package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	public void muyDefcienteTest() {
		Nota n = new Nota(2, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Muy deficiente", calificacion);
	}

	@Test
	public void insuficienteTest() {
		Nota n = new Nota(3, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Insuficiente", calificacion);
	}

	@Test
	public void suficienteTest() {
		Nota n = new Nota(5, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Suficiente", calificacion);
	}

	@Test
	public void bienTest() {
		Nota n = new Nota(6, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Bien", calificacion);
	}

	@Test
	public void notableTest() {
		Nota n = new Nota(8, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Notable", calificacion);
	}

	@Test
	public void sobresalienteTest() {
		Nota n = new Nota(10, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Sobresaliente", calificacion);
	}
}
