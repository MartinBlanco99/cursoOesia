package poo;

public class Madalena {

	private String sabor;
	private double peso;
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Madalena(String sabor, double peso) {
		super();
		this.sabor = sabor;
		this.peso = peso;
	}
	// volumen
	public double getVolumen() {
		
		return this.peso*3;
	}
}
