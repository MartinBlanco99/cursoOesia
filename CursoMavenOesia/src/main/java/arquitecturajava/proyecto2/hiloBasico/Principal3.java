package arquitecturajava.proyecto2.hiloBasico;

public class Principal3 {

	public static void main(String[] args) {
		Thread t = new Thread(new Tarea());
		Thread t2 = new Thread(new Tarea());
		Thread t3 = new Thread(new Tarea());

		t.setName("Hilo 1");
		
		t.start();
		t2.start();
		t3.start();
	}

}
