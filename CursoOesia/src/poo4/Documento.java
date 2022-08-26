package poo4;

public class Documento {

	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Documento(String texto) {
		super();
		this.texto = texto;
	}

	public void imprimir() {
		System.out.println(texto);
	}
}
