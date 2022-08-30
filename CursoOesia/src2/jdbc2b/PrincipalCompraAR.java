package jdbc2b;

import java.util.List;

public class PrincipalCompraAR {

	public static void main(String[] args) {

		List<CompraAR> lista = CompraAR.buscarTodos();

		for (CompraAR c : lista) {
			System.out.println(c.getId());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
			System.out.println(c.getDni());

		}

		System.out.println();

		// CompraAR c1 = new CompraAR("Reloj",200,"4");
		// c1.insertar();

		CompraAR c2 = new CompraAR("Borrar", 1000, "60");
		// c2.insertar();
		// c2.borrar();

		CompraAR cBorrar = new CompraAR(1);
		cBorrar.borrar();

		System.out.println();

		List<CompraAR> listaImportes = CompraAR.buscarTodosPorImporte();

		for (CompraAR c : listaImportes) {
			System.out.println(c.getId());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
			System.out.println(c.getDni());

		}

		System.out.println();

		List<CompraAR> listaConceptos = CompraAR.buscarTodosPorConcepto();

		for (CompraAR c : listaConceptos) {
			System.out.println(c.getId());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
			System.out.println(c.getDni());

		}

		System.out.println();
		List<CompraAR> lista2 = CompraAR.buscarTodosOrdenados("importe");

		for (CompraAR c : lista2) {

			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}
		
		System.out.println();
		List<CompraAR> lista3 = CompraAR.buscarTodosOrdenados("personas_dni");

		for (CompraAR c : lista3) {

			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}
		
		System.out.println();
		List<CompraAR> lista4 = CompraAR.buscarTodosOrdenados("concepto");

		for (CompraAR c : lista4) {

			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}


	}
}
