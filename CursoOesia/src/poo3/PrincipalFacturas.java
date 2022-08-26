package poo3;

public class PrincipalFacturas {

	

	public static void main(String[] args) {
		
		FactoriaFacturas factoria= new FactoriaFacturas();
		
		Factura f1=factoria.getFactura("IVA");
		f1.setConcepto("ordenador");
		f1.setImporte(100);
		System.out.println(f1.getImporteConIva());
		
		Factura f2=factoria.getFactura("ivareducido");
		f2.setConcepto("ordenador2");
		f2.setImporte(100);
		System.out.println(f2.getImporteConIva());
	}

}
