package poo6;

public class Television implements Conectable {
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Television(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public void on() {
		System.out.println("el televisor " + marca+ "se enciende");
		
	}

	@Override
	public void off() {
		System.out.println("el televisor " + marca+ "se apaga");
		
		
	}
}
