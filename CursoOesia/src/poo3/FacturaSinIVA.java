package poo3;

public class FacturaSinIVA extends Factura {

	public FacturaSinIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public FacturaSinIVA() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteConIva() {
		// TODO Auto-generated method stub
		return getImporte()*1.10;
	}

}
