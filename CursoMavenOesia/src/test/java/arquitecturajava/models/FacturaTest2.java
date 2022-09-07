package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FacturaTest2 {
	
	Factura f;
	
	@BeforeEach
	public void setUp() {
		f= new Factura(1, "Sofa", 200);
	}

	@Test
	@DisplayName ("Calcular importe con IVA")
	public void calcularImporteIVA() {
		assertEquals(242, f.getImporteConIVA());
	}

	@Test
	@DisplayName ("Calcular retencion de la factura")
	public void calcularRetencionFactura() {
		assertEquals(30, f.getImporteRetencion());
	}
	
	@Test
	@DisplayName ("Calcular importe con descuento")
	public void calcularImporteConDescuento() {
		assertEquals(170, f.getImporteConDescuento());
	}
}
