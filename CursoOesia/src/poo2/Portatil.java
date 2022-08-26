package poo2;

public class Portatil {

	private String marca;

	private double precio;
	
	private Cargador cargador;
	
	public Cargador getCargador() {
		return cargador;
	}

	public void setCargador(Cargador cargador) {
		this.cargador = cargador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Portatil(String marca,double precio, Cargador cargador) {
		super();
		this.marca = marca;
		this.precio= precio;
		this.cargador = cargador;
	}

	public Portatil(String marca,double precio) {
		super();
		this.marca = marca;
		this.precio= precio;
	}
	
	public double getPrecioFinal() {
	
		if (cargador!=null)
		
		return getPrecio()+ cargador.getPrecio();
		else return getPrecio();
	}
}
