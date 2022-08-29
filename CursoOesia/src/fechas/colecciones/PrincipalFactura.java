package fechas.colecciones;

import java.util.HashMap;

public class PrincipalFactura {

	public static void main(String[] args) {

		HashMap<String, Factura> map = new HashMap<String, Factura>();
		
		Factura f1 = new Factura("F1", 1, 10000);
		Factura f2 = new Factura("F2", 2, 500);
		
		map.put(f1.getConcepto(),f1);

		
	}

}
