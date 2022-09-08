package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NotaTest3 {
	@Test
	public void notaFueraDeRangosValidosTest() {

		RuntimeException excepcion = Assertions.assertThrows(RuntimeException.class, () -> {
			Nota2 nota = new Nota2(-2, "matematicas");
		});
		RuntimeException excepcion2 = Assertions.assertThrows(RuntimeException.class, () -> {
			Nota2 nota = new Nota2(11, "matematicas");
		});

		assertEquals("valor de nota no valido", excepcion.getMessage());
		assertEquals("valor de nota no valido", excepcion2.getMessage());
	}

	@ParameterizedTest
	@DisplayName("Nota insuficiente valor:2 standar valor: 0,3 limites nota")
	@ValueSource(doubles = { 2, 0, 1 })
	public void muyDeficienteTest(double valorNota) {

		Nota2 nota2 = new Nota2(valorNota, "matematicas");
		String calificacion = nota2.getCalificacion();
		assertEquals("Muy deficiente", calificacion);

	}

	@Test
	public void insuficienteTest() {

		Nota2 nota = new Nota2(4, "matematicas");
		String calificacion = nota.getCalificacion();
		assertEquals("Insuficiente", calificacion);
	}
}
