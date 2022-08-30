package jdbc2b;

import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		PersonaAR p = PersonaAR.buscarUna("10");

		List<CompraAR> compras = p.getCompras();

		for (CompraAR c : compras) {

			System.out.println(c.getImporte());
			System.out.println(c.getConcepto());
		}

	}
}
