package arquitecturajava.proyecto2.gastos;

public class GestorCompra implements Runnable {

	private Gastos gastos;

	

	public GestorCompra(Gastos gastos) {
		super();
		this.gastos = gastos;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (gastos) {
				gastos.addGasto(Math.random() * 100);
				gastos.notify();
			}
		}
	}

}
