package jdbc4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libro {
	private int id;
	private String isbn;
	private String titulo;
	private String autor;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();

	public Libro() {
		super();
	}

	public Libro(int id) {
		super();
		this.id = id;
	}

	public Libro(int id, String isbn, String titulo, String autor) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitulos, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(capitulos, other.capitulos) && id == other.id;
	}

}
