package arquitecturajava.models;

import java.util.Objects;

public class Nota2 {
	private double valor;
	private String asignatura;

	public Nota2(double valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor<0 || valor>10) throw new RuntimeException("valor de nota no valido");
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

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota2 other = (Nota2) obj;
		return Objects.equals(asignatura, other.asignatura)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
	

}
