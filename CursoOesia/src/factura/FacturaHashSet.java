package factura;

import java.util.HashSet;

public class FacturaHashSet {

	public static void main(String[] args) {

		Factura factura = new Factura("Ordenador", 0, 125);
		Factura factura2 = new Factura("Movil", 1, 85);
		Factura factura3 = new Factura("Raton", 2, 25);

		HashSet<Factura> lista = new HashSet<Factura>();

		lista.add(factura);
		System.out.println(factura.getConcepto());
		System.out.println(factura.getNumero());
		System.out.println(factura.getImporte());

		System.out.println();

		lista.add(factura2);
		System.out.println(factura2.getConcepto());
		System.out.println(factura2.getNumero());
		System.out.println(factura2.getImporte());

		System.out.println();

		lista.add(factura3);
		System.out.println(factura3.getConcepto());
		System.out.println(factura3.getNumero());
		System.out.println(factura3.getImporte());
		
		System.out.println();
		
		System.out.println(lista);

	}

}
