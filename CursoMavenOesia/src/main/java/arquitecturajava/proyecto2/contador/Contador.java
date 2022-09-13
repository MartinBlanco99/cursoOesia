package arquitecturajava.proyecto2.contador;

public class Contador {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementar() {
		numero = numero + 1;
	}

}
