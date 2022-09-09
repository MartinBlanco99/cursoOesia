package arquitecturajava.proyecto1.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import arquitecturajava.proyecto1.models.Factura;
import arquitecturajava.proyecto1.repositories.IFacturaRepository;

@ExtendWith(MockitoExtension.class)
class FacturaServiceTest {
	
	FacturaService facturaService;
	
	@Mock
	IFacturaRepository facturaRepository;

	@BeforeEach
	void setUp() {
		facturaService = new FacturaService(facturaRepository);
	}

	@Test
	void buscarFacturasTest() {
		List<Factura> datosMock = Arrays.asList(new Factura(1, "Factura1", 20), new Factura(2, "Factura2", 600), new Factura(3, "Factura3",45));
		when(facturaRepository.buscarFacturas()).thenReturn(datosMock);
		
		List<Factura> facturas = facturaService.buscarTodasLasFacturas();
		assertNotNull(facturas);
		assertTrue(facturas.contains(new Factura(1, "Factura1", 20)));
		assertTrue(facturas.contains(new Factura(2, "Factura2", 600)));
		assertTrue(facturas.contains(new Factura(3, "Factura3", 45)));
		
		System.out.println(facturas);

		
	}
	
	@Test
	void insertarFacturaTest() {
		facturaService.insertarFactura(new Factura("Factura0"));
		verify(facturaRepository).insertar(any(Factura.class));
	}
	
	@Test
	void borrarFacturaTest() {
		facturaService.borrarFactura(new Factura("Factura10"));
		verify(facturaRepository).borrar(any(Factura.class));
	}

}
