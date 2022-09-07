package arquitecturajava.models;

public class Nota {
	private int valor;
	private String asignatura;

	public Nota(int valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}

	public double getValor() {
		return valor;
	}

	public void setNota(int valor) {
		this.valor = valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getCalificacion() {
		if (valor >= 0 && valor < 3) {
			return "Muy deficiente";

		} else if (valor >= 3 && valor <= 4) {
			return "Insuficiente";
		} else if (valor == 5) {
			return "Suficiente";
		} else if (valor == 6) {
			return "Bien";
		}else if (valor ==7 || valor ==8) {
			return "Notable";
		}else {
			return "Sobresaliente";
		}
	}

}
