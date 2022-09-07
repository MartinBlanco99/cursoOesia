package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Calculadora suma dos numeros")
	public void sumaCalculadoratest() {
		double num1 = 8;
		double num2 = 26;
		Calculadora c = new Calculadora();
		double suma = c.sumar(num1, num2);
		assertEquals(34, suma);
	}

	@Test
	@DisplayName("Calculadora resta dos numeros")

	public void restaCalculadoraTest() {
		double num1 = 22;
		double num2 = 10;
		Calculadora c = new Calculadora();
		double resta = c.restar(num1, num2);
		assertEquals(12, resta);

	}

	@Test
	@DisplayName("Calculadora multiplica dos numeros")

	public void multiplicacionCalculadoraTest() {
		double num1 = 5;
		double num2 = 6;
		Calculadora c = new Calculadora();
		double multiplicacion = c.multiplicar(num1, num2);
		assertEquals(30, multiplicacion);
	}

	@Test
	@DisplayName("Calculadora divide dos numeros")

	public void divisionCalculadoraTest() {
		double num1 = 10;
		double num2 = 2;
		Calculadora c = new Calculadora();
		double division = c.dividir(num1, num2);
		assertEquals(5, division);
	}

}
