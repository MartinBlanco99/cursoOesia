package arquitecturajava.proyecto2.hilo;

public class Principal {

	static String estaVivo = "true";
	
	
	public static void main(String[] args) {


		HiloParametro hilo = new HiloParametro(estaVivo);
		Thread t = new Thread(hilo);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		estaVivo = "false";
	}

}
