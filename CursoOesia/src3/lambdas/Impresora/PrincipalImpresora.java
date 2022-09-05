package lambdas.Impresora;

public class PrincipalImpresora {

	public static void main(String[] args) {

		Impresora i = new ImpresoraLaser();
		i.imprimir();

		System.out.println();

		Impresora i2 = new ImpresoraTinta();
		i2.imprimir();

		System.out.println();
		
		System.out.println(i.esMasRapida(i2));
		
		System.out.println();
		
		System.out.println(Impresora.masRapida(i,i2).velocidad());
	}

}
