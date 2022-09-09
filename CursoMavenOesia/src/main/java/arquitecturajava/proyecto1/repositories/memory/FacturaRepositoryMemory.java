package arquitecturajava.proyecto1.repositories.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import arquitecturajava.proyecto1.models.Factura;
import arquitecturajava.proyecto1.repositories.IFacturaRepository;

public class FacturaRepositoryMemory implements IFacturaRepository {

	private List<Factura> listaFacturas = new ArrayList<Factura>();

	public FacturaRepositoryMemory(List<Factura> listaFacturas) {
		super();
		this.listaFacturas = listaFacturas;
	}

	@Override
	public List<Factura> buscarFacturas() {
		// TODO Auto-generated method stub
		return listaFacturas;
	}

	@Override
	public void insertar(Factura factura) {
		listaFacturas.add(factura);
	}

	@Override
	public void borrar(Factura factura) {
		listaFacturas.add(factura);
	}

	@Override
	public Optional<Factura> buscarUnaFactura(String concepto) {
		return listaFacturas.stream().filter((f) -> f.getConcepto().equals(concepto)).findFirst();
	}

}
