package lambdas.impresora;

public class ImpresoraTinta implements Impresora {

	@Override
	public void imprimir() {
		System.out.println("La impresora tinta imprime");
	}

	@Override
	public int velocidad() {
		return 5;
	}

}
