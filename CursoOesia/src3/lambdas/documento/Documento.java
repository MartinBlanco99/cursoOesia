package lambdas.documento;

//Tenemos la clase Documento

//la clase documento tiene
//id , titulo, autor , paginas
//queremos recorrer la lista
//y quedarnos con los autores 
//y calcular la suma de todas las paginas que los autores que comienzan por c
//han escrito
//.startWith
//carlos

public class Documento {
	private int id;
	private String titulo;
	private String autor;
	private int paginas;

	public Documento() {
		super();
	}

	public Documento(int id, String titulo, String autor, int paginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

}
