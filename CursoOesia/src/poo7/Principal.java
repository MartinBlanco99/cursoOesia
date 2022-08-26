package poo7;

public class Principal {

	public static void main(String[] args) {
		// Conectable c = new Lampara();

		// c.on();
		// c.off();

		// Conectable c1 = new Bombilla();
		// c1.on();
		// c1.off();

		/*
		 * Bombilla bombilla = new Bombilla(90); Lampara lampara = new
		 * Lampara(bombilla); lampara.on(); lampara.off();
		 * 
		 * System.out.println();
		 */
		Bombilla b1 = new Bombilla(100);
		Bombilla b2 = new Bombilla(80);

		LamparaTecho lt = new LamparaTecho();
		lt.addBombilla(b1);
		lt.addBombilla(b2);
		lt.on();
		lt.off();

	}

}
