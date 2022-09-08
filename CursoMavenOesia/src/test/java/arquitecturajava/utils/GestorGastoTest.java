package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorGastoTest {

	@Test
	void getImporte2CuotasTest() {
		Gasto g1 = new Gasto(200);
		Gasto g2 = new Gasto(100);
		GestorGasto gestorGasto = new GestorGasto(g1, g2);
		
		assertEquals(155, gestorGasto.getImporte2Cuotas());
	}
	
	@Test
	void getImporte4CuotasTest() {
		Gasto g1 = new Gasto(200);
		Gasto g2 = new Gasto(100);
		GestorGasto gestorGasto = new GestorGasto(g1, g2);
		
		assertEquals(95, gestorGasto.getImporte4Cuotas());
	}

}
