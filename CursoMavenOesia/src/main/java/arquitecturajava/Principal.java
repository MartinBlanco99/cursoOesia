package arquitecturajava;

import arquitecturajava.utils.Calculadora;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola desde Maven");
		System.out.println();
		
		Calculadora c = new Calculadora();
		System.out.println(c.sumar(6, 8));

	}

}
