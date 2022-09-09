package arquitecturajava.proyecto1.repositories;

import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Factura;

public interface IFacturaRepository  {
	List<Factura> buscarFacturas();
	
	void insertar(Factura factura);
	
	void borrar (Factura factura);
	
	Optional<Factura> buscarUnaFactura(String concepto);

}
