package factura;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Factura [concepto=" + concepto + ", numero=" + numero + ", importe=" + importe + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return numero == other.numero;
	}
	
	
	
	

}
