package poo2;

import java.util.ArrayList;

public class PrincipalArrayList {

	public static void main(String[] args) {

		// uso de una clase generica
		ArrayList<String> milista = new ArrayList<String>();

		milista.add("hola");
		milista.add("que tal");
		milista.add("estas");

		for (int i = 0; i < milista.size(); i++) {

			System.out.println(milista.get(i));
		}
		System.out.println("**************");

		for (String cadena : milista) {

			System.out.println(cadena);
		}

		milista.remove(0);
		System.out.println("**************");
		for (String cadena : milista) {

			System.out.println(cadena);
		}
		
		
	}
}
