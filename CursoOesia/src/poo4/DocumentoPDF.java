package poo4;

public class DocumentoPDF extends Documento {

	public DocumentoPDF(String texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println("imprimo pdf");
		super.imprimir();
	}

	
	

}
