package sentenciasIf;

public class Principal5 {

	public static void main(String[] args) {
		int nota = 5;
		if (nota > 0 && nota < 3) {
			System.out.println("muy mal");
		} else if (nota >= 3 && nota < 5) {
			System.out.println("has suspendido");
		} else if (nota >= 5 && nota < 8) {

			System.out.println("bien");
		} else {
			System.out.println("muy bien");
		}

	}

}
