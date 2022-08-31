package jdbc4.models;

import java.util.Objects;

public class Capitulo {
	private int id;
	private int numCapitulo;
	private int id_libro;

	public Capitulo() {
		super();
	}

	public Capitulo(int id) {
		super();
		this.id = id;
	}

	public Capitulo(int id, int numCapitulo, int id_libro) {
		super();
		this.id = id;
		this.numCapitulo = numCapitulo;
		this.id_libro = id_libro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumCapitulo() {
		return numCapitulo;
	}

	public void setNumCapitulo(int numCapitulo) {
		this.numCapitulo = numCapitulo;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
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
		Capitulo other = (Capitulo) obj;
		return id == other.id;
	}

}
