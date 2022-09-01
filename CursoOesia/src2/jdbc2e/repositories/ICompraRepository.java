package jdbc2e.repositories;

import jdbc2e.models.Compra;

public interface ICompraRepository {

	void insertar(Compra c);

	void borrar(Compra c);

}