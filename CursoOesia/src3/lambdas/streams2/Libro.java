package lambdas.streams2;

public class Libro {

	private String titulo;
	private double precio;

	public Libro(String titulo, double precio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
