package arquitecturajava.utils;

import java.util.ArrayList;
import java.util.List;

public class GestorGasto {
//	private List<Gasto> gastos = new ArrayList<Gasto>();
//
//	public List<Gasto> getGastos() {
//		return gastos;
//	}
//
//	public void setGastos(List<Gasto> gastos) {
//		this.gastos = gastos;
//	}

	private Gasto gasto1;
	private Gasto gasto2;

	public GestorGasto(Gasto gasto1, Gasto gasto2) {
		super();
		this.gasto1 = gasto1;
		this.gasto2 = gasto2;
	}

	public Gasto getGasto1() {
		return gasto1;
	}

	public void setGasto1(Gasto gasto1) {
		this.gasto1 = gasto1;
	}

	public Gasto getGasto2() {
		return gasto2;
	}

	public void setGasto2(Gasto gasto2) {
		this.gasto2 = gasto2;
	}

	public double getImporte2Cuotas() {
		if (gasto1 != null && gasto2 != null) {
			return gasto1.getImporte2Cuotas() + gasto2.getImporte2Cuotas() + 5;
		} else {
			return gasto1.getImporte2Cuotas() + gasto2.getImporte2Cuotas();

		}

	}

	public double getImporte4Cuotas() {
		if (gasto1 != null && gasto2 != null) {

			return gasto1.getImporte4Cuotas() + gasto2.getImporte4Cuotas() + 5;
		} else {
			return gasto1.getImporte4Cuotas() + gasto2.getImporte4Cuotas();

		}

	}
}