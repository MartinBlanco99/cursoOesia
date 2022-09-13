package arquitecturajava.proyecto2.hiloBasico;

public class Tarea implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Tarea nueva " + i);
		}
	}

}
