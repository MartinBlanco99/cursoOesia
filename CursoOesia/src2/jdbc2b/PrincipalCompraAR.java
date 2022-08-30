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

}
}
