package arquitecturajava.proyecto2.hilo;

public class HiloParametro implements Runnable {

	private String estaVivo = "true";

	public HiloParametro(String estaVivo) {
		super();
		this.estaVivo = estaVivo;
	}

	@Override
	public void run() {

		while (estaVivo.equals("true")) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("estoy vivo");
		}
	}

	public void stop() {
		estaVivo = "false";
	}

}
