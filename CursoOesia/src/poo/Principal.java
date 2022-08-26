package poo;

public class Principal {

	public static void main(String[] args) {
	
		// el metodo que se encarga de la inicializacion
		// correcta del objeto
		Rectangulo r= new Rectangulo(50,7);
		
		System.out.println(r.getLado1());
		System.out.println(r.getLado2());
		System.out.println(r.area());
		System.out.println(r.perimetro());
	}

}
