package factura;

public class Factura implements Comparable<Factura> {

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

	public void addFactura(Factura factura) {

	}

	@Override
	public int compareTo(Factura o) {

		if (this.getImporte() > o.getImporte()) {
			return 1;

		} else if (this.getImporte() == o.getImporte())
			return 0;

		else
			return -1;
	}
	
	

}
