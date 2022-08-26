package poo4;

public class DocumentoHTML extends Documento {

	public DocumentoHTML(String texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println("<html>");
		super.imprimir();
		System.out.println("</html>");
	}

	
	

}
