package arquitecturajava.proyecto2.alumno;

public class Nota {
	
	private double valor;

	public Nota(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean esSobresaliente() {
		return valor >= 9;
	}

}
