package lambdas.impresora;

public class ImpresoraLaser implements Impresora {

	@Override
	public void imprimir() {
		System.out.println("La impresora laser imprime");
	}

	@Override
	public int velocidad() {
		return 20;
	}

}
