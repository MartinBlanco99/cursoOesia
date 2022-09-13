package arquitecturajava.proyecto2.contador;

public class Contador {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public synchronized void incrementar() {
		numero = numero + 1;
		try {
			wait();
			System.out.println(numero);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
