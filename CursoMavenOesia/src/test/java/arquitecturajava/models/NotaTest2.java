package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NotaTest2 {
//	@Test
//	public void notaNoValidaTest() {
//
//		RuntimeException excepcion = Assertions.assertThrows(RuntimeException.class, () -> {
//			Nota nota = new Nota(-2, "matematicas");
//		});
//
//		assertEquals("valor de nota no valido", excepcion.getMessage());
//	}

	@ParameterizedTest
	@ValueSource(doubles= {0,1,2})
	public void muyDefcienteTest(double valorNota) {
		Nota2 n = new Nota2(valorNota, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Muy deficiente", calificacion);
	}

	@ParameterizedTest
	@ValueSource(doubles= {3,4})
	public void insuficienteTest(double valorNota) {
		Nota2 n = new Nota2(valorNota, "Asignatura 1");
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

	@ParameterizedTest
	@ValueSource(doubles= {7,8})
	public void notableTest(double valorNota) {
		Nota2 n = new Nota2(valorNota, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Notable", calificacion);
	}

	@ParameterizedTest
	@ValueSource(doubles= {9,10})
	public void sobresalienteTest(double valorNota) {
		Nota2 n = new Nota2(valorNota, "Asignatura 1");
		String calificacion = n.getCalificacion();
		assertEquals("Sobresaliente", calificacion);
	}

}
