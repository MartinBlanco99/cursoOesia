package calculadora;

public class PrincipalCalculadora {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		System.out.println(c.sumar(10, 6));
		System.out.println(c.restar(20, 8));

		System.out.println(Calculadora.sumarNum(5, 25));
		System.out.println(Calculadora.restarNum(30, 22));

	}

}
