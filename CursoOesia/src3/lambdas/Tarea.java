package lambdas;

public class Tarea implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i <5; i++) {
			
			try {
				Thread.sleep(200);
				System.out.println("hola");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
