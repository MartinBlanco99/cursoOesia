package arquitecturajava.proyecto2;

public class Principal {

	public static void main(String[] args) {
		HiloBasico hiloBasico = new HiloBasico();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
