package jdbc2e.models;

import java.util.Objects;

public class Compra {

	private int id;
	private String concepto;
	private double importe;
	private String dni;

	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(int id) {
		super();
		this.id = id;
	}

	public Compra(String concepto, double importe, String dni) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return id == other.id;
	}

}
