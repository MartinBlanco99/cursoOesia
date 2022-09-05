package lambdas.factura;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		List<Factura> facturas = new ArrayList<Factura>();

		facturas.add(new Factura(1, "Mochila", 20, true));
		facturas.add(new Factura(2, "Sorbete", 3.25, false));
		facturas.add(new Factura(3, "Coche", 16000, true));

		Stream<Factura> flujo = facturas.stream();

		flujo.filter(Factura::isPagada).map(Factura::getIva).forEach(System.out::println);

	}

}
