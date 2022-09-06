package lambdas.factura;

public class Albaran {

	private int numero;
	private double importe;
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
	public Albaran(int numero, double importe) {
		super();
		this.numero = numero;
		this.importe = importe;
	}
	
	@Override
	public String toString() {
		return "Albaran [numero=" + numero + ", importe=" + importe + "]";
	}
	public Albaran (Factura factura) {
		this.numero=factura.getNumero();
		this.importe=factura.getImporte();
	}
}
