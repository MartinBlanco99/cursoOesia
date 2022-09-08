package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GastoTest {

	@Test
	void getImporte2CuotasTest() {
		Gasto gasto = new Gasto(200);
		assertEquals(100, gasto.getImporte2Cuotas());
	}

	@Test
	void getImporte4CuotasTest() {
		Gasto gasto = new Gasto(200);
		assertEquals(60, gasto.getImporte4Cuotas());
	}

}
