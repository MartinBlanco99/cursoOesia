package numeros;

import java.util.ArrayList;

public class PrincipalNumeros {

	public static void main(String[] args) {
		int numero = 10;
		ArrayList<Integer>lista = new ArrayList<Integer>();
		
		lista.add(numero);
		
		int numero2 = lista.get(0);
		
		Integer numero3 = new Integer(numero2);
		Integer numero4 = Integer.valueOf(numero2);
		int numero5 = numero4.intValue();
		
		System.out.println(numero5);
		
		String texto = numero4.toString();
		System.out.println(texto);
		
		System.out.println(Math.PI);
		System.out.println(Math.sin(70));
		System.out.println(Math.pow(2,6));
		System.out.println(Math.sqrt(16));
	}

}
