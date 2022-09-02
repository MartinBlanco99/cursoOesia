package tiposGenercios;

import java.util.Iterator;

public class PrincipalIterable2 {

	public static void main(String[] args) {
		BolsaIterable2 <String> b = new BolsaIterable2 <String>(5);

		b.add("pan");
		b.add("estuche");
		b.add("manzana");
		
		BolsaIterable2<PersonaIterable2> bolsaPersona = new BolsaIterable2<PersonaIterable2>(5);
		bolsaPersona.add(new PersonaIterable2("martin"));
		bolsaPersona.add(new PersonaIterable2("mario"));
		
		
		for(PersonaIterable2 p : bolsaPersona) {
			System.out.println(p.getNombre());
		}
		
		System.out.println();
		
		Iterator<String> iteraror = b.iterator();
		while(iteraror.hasNext()) {
			System.out.println(iteraror.next());
		}

	}

}
