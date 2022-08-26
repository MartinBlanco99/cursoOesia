package poo;

public class Rectangulo {

	private int lado1;
	private int lado2;

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		if (lado1<10)
		this.lado1 = lado1;
		else
		this.lado1=10;
	}

	public int getLado2() {
		return lado2;
	}



	public void setLado2(int lado2) {
		if (lado2<10)
		this.lado2 = lado2;
		else
		this.lado2=10;
	}


	public Rectangulo(int lado1, int lado2) {
		setLado1(lado1);
		setLado2(lado2);
	}

	double area() {
		
		return lado1*lado2;
	}
	double perimetro() {
		
		return 2*lado1+2*lado2;
	}
}
