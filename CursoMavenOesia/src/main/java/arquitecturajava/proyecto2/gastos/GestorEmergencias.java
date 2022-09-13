package arquitecturajava.proyecto2.gastos;

public class GestorEmergencias implements Runnable {

	private Gastos gastos;

	public GestorEmergencias(Gastos gastos) {
		super();
		this.gastos = gastos;
	}

	@Override
	public void run() {

		synchronized (gastos) {

			while (gastos.getGastosTotal() < 300) {

				try {
					System.out.println("Vas bien " +gastos.getGastosTotal());
					gastos.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Te has pasado de gastos " + gastos.getGastosTotal());

		}

	}

}
