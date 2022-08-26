package poo3;

public class FactoriaFacturas {

	
	public Factura getFactura(String tipo) {
		
		if(tipo.equals("IVA")) {
			
			return new FacturaConIVA();
		}else {
			return new FacturaSinIVA();
		}
		
 	}

}
