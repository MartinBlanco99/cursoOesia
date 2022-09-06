package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumaCalculadoratest() {

		double num1 = 8;
		double num2 = 26;
		Calculadora c = new Calculadora();
		double suma = c.sumar(num1, num2);
		assertEquals(34, suma);
	}

	@Test
	void restaCalculadoraTest() {
		double num1 = 22;
		double num2 = 10;
		Calculadora c = new Calculadora();
		double resta = c.restar(num1, num2);
		assertEquals(12, resta);

	}

	@Test
	void multiplicacionCalculadoraTest() {
		double num1 = 5;
		double num2 = 6;
		Calculadora c = new Calculadora();
		double multiplicacion = c.multiplicar(num1, num2);
		assertEquals(30, multiplicacion);
	}

}
