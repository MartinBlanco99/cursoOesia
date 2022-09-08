package arquitecturajava.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest2 {

	Alumno a;
	List<Nota2>notas;

	@BeforeEach
	public void setUp() {
		a = new Alumno();
		a.setNotasLista(listaNotasIncial());
	}

	@Test
	public void addNotaTest() {
		Nota2 nota = new Nota2(5, "galego");
		assertFalse(a.getNotasLista().contains(nota));
		a.addNota(nota);
		assertTrue(a.getNotasLista().contains(nota));
	}

	@Test
	public void removeNotaTest() {
		Nota2 nota = new Nota2(5, "galego");
		a.removeNota(nota);
		assertFalse(a.getNotasLista().contains(nota));
	}

	@Test
	public void cursoAptoTest() {
		List<Nota2> notas = listaNotasParaMedia();
		a.setNotasLista(notas);
		assertTrue(a.apruebaElCurso());
	}

	@Test
	void alumnoNotaMayorTest() {
		List<Nota2> notas = listaNotasParaMedia();
		a.setNotasLista(notas);
		assertEquals(new Nota2(8, "lengua"), a.notaMayor());

	}

	@Test
	void notasSuspensasTest() {
		List<Nota2> notas = listaNotasParaMedia();
		a.setNotasLista(notas);
		List<Nota2> notasSuspensas = a.suspensos();
		notasSuspensas.forEach((nota) -> assertTrue(nota.getValor() < 5));
	}

	private List<Nota2> listaNotasIncial() {
		notas = new ArrayList<Nota2>();
		Nota2 n = new Nota2(6, "lengua");
		Nota2 n2 = new Nota2(4, "ingles");
		Nota2 n3 = new Nota2(4, "lengua");
		Collections.addAll(notas, n, n2,n3);
		return notas;
	}

	private List<Nota2> listaNotasParaMedia() {
		Nota2 n1 = new Nota2(6, "lengua");
		Nota2 n2 = new Nota2(4, "ingles");
		Nota2 n3 = new Nota2(8, "lengua");
		List<Nota2> notas = new ArrayList<Nota2>();
		Collections.addAll(notas, n1, n2, n3);
		return notas;
	}
}
