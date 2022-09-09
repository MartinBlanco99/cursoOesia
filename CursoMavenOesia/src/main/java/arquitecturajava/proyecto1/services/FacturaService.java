package arquitecturajava.proyecto1.services;

import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Factura;
import arquitecturajava.proyecto1.repositories.IFacturaRepository;

public class FacturaService {
	private IFacturaRepository repository;

	public FacturaService(IFacturaRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Factura> buscarTodasLasFacturas() {
		return repository.buscarFacturas();
	}

	public void insertarFactura(Factura factura) {
		repository.insertar(factura);
	}

	public void borrarFactura(Factura factura) {
		repository.borrar(factura);
	}

	public Optional<Factura> buscarUnaFactura(String concepto) {
		return repository.buscarUnaFactura(concepto);
	}
	
	

}
