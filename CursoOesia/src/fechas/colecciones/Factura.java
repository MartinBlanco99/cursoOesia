package fechas.colecciones;

public class Factura {

	private String concepto;
	private int numero;
	private double importe;

	public Factura(String concepto, int numero, double importe) {
		super();
		this.concepto = concepto;
		this.numero = numero;
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

}
