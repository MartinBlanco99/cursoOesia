package cadenas;

public class Priincipal2 {

	public static void main(String[] args) {

		String cadena = "hola que tal estas";

		System.out.println(cadena.toUpperCase());

		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}

		System.out.println(contarLetraATexto(cadena, 'a'));
		System.out.println(contarVocalesTexto(cadena));
	}

	public static int contarLetraATexto(String texto, char caracter) {

		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == caracter)
				contador++;
		}
		return contador;

	}

	public static int contarVocalesTexto(String texto) {

		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
					|| texto.charAt(i) == 'u')
				contador++;
		}
		return contador;

	}

}
