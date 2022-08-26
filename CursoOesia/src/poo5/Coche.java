package poo5;

public class Coche extends Vehiculo {

	private int plazas;

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public void acelerar() {
		System.out.println("Cpche acelera a 10m/s");
	}

}
