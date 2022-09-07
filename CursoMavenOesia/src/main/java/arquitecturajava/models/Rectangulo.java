package arquitecturajava.models;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double area() {
		return getBase() * getAltura();
	}

	public double perimetro() {
		return (getBase() * 2) + (getAltura() * 2);
	}

}
