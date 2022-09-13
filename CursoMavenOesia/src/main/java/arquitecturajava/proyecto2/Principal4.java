package arquitecturajava.proyecto2;

public class Principal4 {

	public static void main(String[] args) {
		Thread t = new Thread(new Tarea2());
		Thread t2 = new Thread(new Tarea2());

		t.start();
		t2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(t.getName() + " : " + t.getState());
			System.out.println(t2.getName() + " : " + t2.getState());
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
