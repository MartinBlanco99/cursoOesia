package lambdas.factura;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;
	private boolean pagada;

	public Factura(int numero, String concepto, double importe, boolean pagada) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.pagada = pagada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public double getIva() {
		return importe * 0.21;
	}

}
