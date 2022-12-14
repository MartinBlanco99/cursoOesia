package arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class GestorGastoTest {

	@Test
	void getImporte2CuotasTest() {
		Gasto g1 = mock(Gasto.class);
		Gasto g2 = mock(Gasto.class);

		GestorGasto gestorGasto = new GestorGasto(g1, g2);

		when(g1.getImporte2Cuotas()).thenReturn(50.0);
		when(g2.getImporte2Cuotas()).thenReturn(50.0);

		assertEquals(105, gestorGasto.getImporte2Cuotas());

		verify(g1).getImporte2Cuotas();
		verify(g2).getImporte2Cuotas();
	}

	@Test
	void getImporte4CuotasTest() {
		Gasto g1 = mock(Gasto.class);
		Gasto g2 = mock(Gasto.class);

		GestorGasto gestorGasto = new GestorGasto(g1, g2);

		when(g1.getImporte4Cuotas()).thenReturn(50.0);
		when(g2.getImporte4Cuotas()).thenReturn(50.0);

		assertEquals(105, gestorGasto.getImporte4Cuotas());

		verify(g1).getImporte4Cuotas();
		verify(g2).getImporte4Cuotas();
	}

	@Test
	void multipleCuotasTest() {
		Gasto g1 = mock(Gasto.class);
		Gasto g2 = mock(Gasto.class);

		GestorGasto gestorGasto = new GestorGasto(g1, g2);

		//when(g1.getImporteCuotas(3)).thenReturn(50.0);
		//when(g2.getImporteCuotas(3)).thenReturn(50.0);

		when(g1.getImporteCuotas(anyInt())).thenReturn(50.0);
		when(g2.getImporteCuotas(anyInt())).thenReturn(50.0);


		
		assertEquals(105, gestorGasto.getImporteCuotas(3));

		// verify(g1).getImporteCuotas();
		// verify(g2).getImporteCuotas();
	}
}
