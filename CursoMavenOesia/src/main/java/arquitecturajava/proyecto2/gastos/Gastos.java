package arquitecturajava.proyecto2.gastos;

import java.util.ArrayList;

public class Gastos {
	ArrayList<Double> importes = new ArrayList<Double>();

	public Gastos(ArrayList<Double> importes) {
		super();
		this.importes = importes;
	}

	public Gastos() {
		super();
	}

	public void addGasto(double importe) {
		importes.add(importe);
	}

	public double getGastosTotal() {
		double total = 0;

		for (double importe : importes) {
			total += importe;
		}
		return total;
	}
}
