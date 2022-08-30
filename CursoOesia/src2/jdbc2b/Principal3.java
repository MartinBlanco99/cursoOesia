package jdbc2b;

import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
List<PersonaAR> lista=PersonaAR.buscarTodoCompras();
		
		for (PersonaAR p:lista) {
			
			System.out.println(p.getDni());
			
			System.out.println(p.getNombre());
			
			for (CompraAR c: p.getCompras()) {
				System.out.println(c.getConcepto());
				System.out.println(c.getImporte());
			}
		}
	}

}
