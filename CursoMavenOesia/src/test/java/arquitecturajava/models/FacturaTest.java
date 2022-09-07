package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	@DisplayName ("Calcular importe con IVA")
	public void calcularImporteIVA() {
		Factura f = new Factura(1, "Cama", 200);
		assertEquals(242, f.getImporteConIVA());
	}

	@Test
	@DisplayName ("Calcular retencion de la factura")
	public void calcularRetencionFactura() {
		Factura f = new Factura(1, "Cama", 200);
		assertEquals(30, f.getImporteRetencion());
	}
	
	@Test
	@DisplayName ("Calcular importe con descuento")
	public void calcularImporteConDescuento() {
		Factura f = new Factura(1, "Cama", 200);
		assertEquals(170, f.getImporteConDescuento());
	}
}
