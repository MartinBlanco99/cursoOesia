package tiposGenercios;

import java.util.Iterator;

public class PrincipalIterable {

	public static void main(String[] args) {
		BolsaIterable b = new BolsaIterable(5);

		b.add("pan");
		b.add("estuche");
		b.add("manzana");

		for (String elemento : b) {
			System.out.println(elemento);
		}
		
		System.out.println();
		
		Iterator<String> iteraror = b.iterator();
		while(iteraror.hasNext()) {
			System.out.println(iteraror.next());
		}

	}

}
