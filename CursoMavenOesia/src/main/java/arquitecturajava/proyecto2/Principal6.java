package arquitecturajava.proyecto2;

public class Principal6 {

	public static void main(String[] args) {
		Thread t = new Thread(new Tarea2());		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finalizado");

		

		
	}

}
