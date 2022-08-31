package jdbc2c;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		PersonaAR p = new PersonaAR("60");

		List<CompraAR> compras = p.getCompras();

		for (CompraAR c : compras) {

			System.out.println(c.getImporte());
			System.out.println(c.getConcepto());
		}

	}
}
