package jdbc2d.repositories;

import jdbc2c.models.Compra;

public interface ICompraRepository {

	void insertar(Compra c);

	void borrar(Compra c);

}