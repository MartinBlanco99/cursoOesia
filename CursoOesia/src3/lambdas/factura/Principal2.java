package lambdas.factura;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		List<Factura> facturas = new ArrayList<Factura>();

		facturas.add(new Factura(1, "Mochila", 20, true));
		facturas.add(new Factura(2, "Sorbete", 3.25, false));
		facturas.add(new Factura(3, "Coche", 16000, true));

		Stream<Factura> flujo = facturas.stream();

		OptionalDouble oResultado=flujo.filter(Predicate.not(Factura::isPagada))
				.mapToDouble(Factura::getIva).reduce((a,i)->a+i);
					
				
				 if (oResultado.isPresent()) {
					 
					 System.out.println(oResultado.getAsDouble());
				 }
				
	}

}
