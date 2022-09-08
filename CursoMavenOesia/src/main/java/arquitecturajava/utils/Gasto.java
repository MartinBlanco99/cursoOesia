package arquitecturajava.utils;

public class Gasto {
	private double importe;

	public Gasto(double importe) {
		super();
		this.importe = importe;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getImporte2Cuotas() {
		return importe / 2;
	}

	public double getImporte4Cuotas() {
		return importe / 4 * 1.20;
	}

}
