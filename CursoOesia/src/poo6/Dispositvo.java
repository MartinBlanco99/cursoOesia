package poo6;

public abstract class Dispositvo {
	private String marca;
	private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract void encender();
	
	public abstract void apagar();
}
