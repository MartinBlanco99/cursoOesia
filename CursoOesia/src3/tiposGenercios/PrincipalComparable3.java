package tiposGenercios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalComparable3 {

	public static void main(String[] args) {
		List<PersonaIterable4> bolsaPersonas = new ArrayList<PersonaIterable4>();
		bolsaPersonas.add(new PersonaIterable4("julian","blanco",20));
		bolsaPersonas.add(new PersonaIterable4("rosa","lopez", 19));
		bolsaPersonas.add(new PersonaIterable4("mencia","suarez", 32));
		bolsaPersonas.add(new PersonaIterable4("victor", "gimenez", 42));
		bolsaPersonas.add(new PersonaIterable4("estefania", "martinez", 13));

		Collections.sort(bolsaPersonas, new ApellidosComparator());
		for (PersonaIterable4 p : bolsaPersonas) {
			System.out.println( p.getNombre() +" "+ p.getApellidos());
			
		}

	}

}
