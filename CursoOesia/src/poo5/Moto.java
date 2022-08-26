package poo5;

public class Moto extends Vehiculo {

	private String tipoEncadenado;

	public String getTipoEncadenado() {
		return tipoEncadenado;
	}

	public void setTipoEncadenado(String tipoEncadenado) {
		this.tipoEncadenado = tipoEncadenado;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto acelera a 5m/s");
	}

}
