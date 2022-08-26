package factura;

import java.util.HashSet;

public class FacturaHashSet2 {
public static void main(String[] args) {
	
	HashSet<Factura> conjunto = new HashSet<Factura>();
	conjunto.add(new Factura("Ordenador 0", 0, 100));
	conjunto.add(new Factura("Ordenador 1", 1, 1000));
	conjunto.add(new Factura("Ordenador 2", 2, 600));
	conjunto.add(new Factura("Ordenador 3", 3, 1650));
	conjunto.add(new Factura("Ordenador 3", 3, 1650));

	
	for(Factura f : conjunto) {
		System.out.println(f.getNumero());
		System.out.println(f.getConcepto());
	}

	
	
}
}
