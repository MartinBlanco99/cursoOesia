package tiposGenercios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalComparable {

	public static void main(String[] args) {
		List<PersonaIterable2> bolsaPersonas = new ArrayList<PersonaIterable2>();
		bolsaPersonas.add(new PersonaIterable2("julian"));
		bolsaPersonas.add(new PersonaIterable2("rosa"));
		bolsaPersonas.add(new PersonaIterable2("mencia"));
		bolsaPersonas.add(new PersonaIterable2("victor"));
		bolsaPersonas.add(new PersonaIterable2("estefania"));

		Collections.sort(bolsaPersonas);
		for (PersonaIterable2 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

	}

}
