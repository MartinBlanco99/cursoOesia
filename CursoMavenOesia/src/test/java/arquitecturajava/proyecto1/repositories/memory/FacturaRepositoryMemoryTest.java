package arquitecturajava.proyecto1.repositories.memory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import arquitecturajava.proyecto1.models.Factura;
import arquitecturajava.proyecto1.repositories.IFacturaRepository;

class FacturaRepositoryMemoryTest {

	IFacturaRepository facturaRepository;
	List<Factura> listaFacturasInicial;

	@BeforeEach
	void setUp() {
		listaFacturasInicial = new ArrayList<Factura>();
		listaFacturasInicial.add(new Factura(1, "Factura1", 500));
		listaFacturasInicial.add(new Factura(2, "Factura2", 50));
		listaFacturasInicial.add(new Factura(3, "Factura3", 5000));
		facturaRepository = new FacturaRepositoryMemory(listaFacturasInicial);

	}

	@Test
	void buscarFacturasTest() {
		List<Factura> lista = facturaRepository.buscarFacturas();
		assertNotNull(lista);
		assertArrayEquals(listaFacturasInicial.toArray(), lista.toArray());
	}

	@Test
	void insertarFacturaTest() {
		Factura f = new Factura(0, "Factura0", 1200);
		facturaRepository.insertar(f);
		assertTrue(listaFacturasInicial.contains(f));
	}

	@Test
	void borrarFacturaTest() {
		facturaRepository.borrar(new Factura("Factura borrada"));
		assertFalse(listaFacturasInicial.contains(new Factura("Factura borrada")));
	}

	@Test
	void buscarUnaFacturaTest() {
		Optional<Factura> oFactura = facturaRepository.buscarUnaFactura("Factura1");
		assertTrue(oFactura.isPresent());

	}

}
