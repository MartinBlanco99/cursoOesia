package arquitecturajava.proyecto2.hiloBasico;

public class Principal2 {

	public static void main(String[] args) {
		Thread t = new Thread(new Tarea());
		
		t.start();
	}

}
