package factura;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Factura f = new Factura("Factura 1", 1, 1200);
		Factura f1 = new Factura("Factura 2", 2, 600);
		Factura f2 = new Factura("Factura 3", 3, 105200);
		Factura f3 = new Factura("Factura 4", 4, 600000);
		
		List<Factura>listaFacturas = Arrays.asList(f,f1,f2,f3);
		Collections.sort(listaFacturas);
		for(Factura factura:listaFacturas) {
			System.out.println(factura.getConcepto());
			System.out.println(factura.getImporte());
		}

		
	}

}
