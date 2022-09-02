package tiposGenercios;

public class Principal {

	public static void main(String[] args) {
		Bolsa b = new Bolsa();
		
		b.addElemento("pan");
		b.addElemento("estuche");
		b.addElemento("manzana");
		
		for(String elemento: b.getElementos()) {
			System.out.println(elemento);
		}

	}

}
