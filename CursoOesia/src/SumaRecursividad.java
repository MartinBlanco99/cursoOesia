import java.util.Scanner;

public class SumaRecursividad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 5;

		do {
			System.out.println("Escribe un numero");
			num = sc.nextInt();
		} while (num <= 0);

		System.out.println(suma(num));

	}

	public static double suma(int numero) {
		if (numero == 1)
			return 1;
		else
			return numero + suma(numero - 1);
	}

}
