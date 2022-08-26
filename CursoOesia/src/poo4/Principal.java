package poo4;

public class Principal {

	public static void main(String[] args) {
		
		//polimorficas
		FactoriaDocumentos f= new FactoriaDocumentos();
		Documento d1= f.creaDocumento("hola", "HTML");
		Documento d2= f.creaDocumento("hola2", "pdf");
	
		d1.imprimir();
		d2.imprimir();

	}

}
