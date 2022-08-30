package jdbc2b;

import java.util.List;

public class PrincipalCompraAR {

	public static void main(String[] args) {
		
		List<CompraAR> lista = CompraAR.buscarTodos();
		
		for(CompraAR c : lista ) {
			System.out.println(c.getId());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
			System.out.println(c.getDni());

			
		}
		
		//CompraAR c1 = new CompraAR("Reloj",200,"4");
		//c1.insertar();
		
		CompraAR c2 = new CompraAR("Borrar",1000,"60");
		//c2.insertar();
		//c2.borrar();
		
		CompraAR cBorrar = new CompraAR(1);
		cBorrar.borrar();

}
}
