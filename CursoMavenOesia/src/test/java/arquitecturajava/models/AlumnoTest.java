package arquitecturajava.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {

	Alumno a;

	@BeforeEach
	public void setUp() {
		a = new Alumno();
		List<Nota2> notas = new ArrayList<Nota2>();
		Nota2 n = new Nota2(6, "lengua");
		Nota2 n2 = new Nota2(4, "ingles");
		notas.add(n);
		notas.add(n2);
		a.setNotasLista(notas);
	}

	@Test
	public void addNotaTest() {
		//a.addNota(new Nota2(6, "frances"));
		Nota2 n0 = new Nota2(5, "galego");
		a.addNota(n0);
		//assertEquals(3, a.getNotasLista().size());
		assertTrue(a.getNotasLista().contains(n0));
	}

	@Test
	public void removeNotaTest() {
		Nota2 n3 = new Nota2(4, "ingles");
		a.removeNota(n3);
		assertEquals(1, a.getNotasLista().size());
	}

}
