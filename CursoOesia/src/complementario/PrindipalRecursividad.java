package complementario;

public class PrindipalRecursividad {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorial2(5));
	}

	public static double factorial(int numero) {

		int factorial = 1;
		for (int i = 1; i <= numero; i++) {

			factorial = factorial * i;
		}
		return factorial;
	}

	public static double factorial2(int numero) {

		if (numero == 1) {
			return 1;
		} else {

			return numero * factorial2(numero - 1);
		}
	}
}
