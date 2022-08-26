package poo;

public class Principal2 {

	public static void main(String[] args) {
		
		Factura f= new Factura (1,"ordenador",500);
		Factura f2= new Factura();
		Factura f3= new Factura (2,"tablet");
		System.out.println(f.getImporte());
		System.out.println(f.getImporteConIVA());
		System.out.println(f.getImporteConIVA(21));
		System.out.println(f.getImporteConIVA(10));

	}

}
