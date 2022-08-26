package poo7;

import java.util.ArrayList;
import java.util.List;

public class LamparaTecho implements Conectable {

	List<Bombilla> bombillas = new ArrayList<Bombilla>();

	public void addBombilla(Bombilla b) {
		bombillas.add(b);
	}

	@Override
	public void on() {
		for (Conectable c : bombillas) {
			c.on();
		}
	}

	@Override
	public void off() {
		for (Conectable c : bombillas) {
			c.off();
		}
	}

}
