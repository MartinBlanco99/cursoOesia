package tiposGenercios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalComparable2 {

	public static void main(String[] args) {
		List<PersonaIterable3> bolsaPersonas = new ArrayList<PersonaIterable3>();
		bolsaPersonas.add(new PersonaIterable3("julian",20));
		bolsaPersonas.add(new PersonaIterable3("rosa", 19));
		bolsaPersonas.add(new PersonaIterable3("mencia", 32));
		bolsaPersonas.add(new PersonaIterable3("victor", 42));
		bolsaPersonas.add(new PersonaIterable3("estefania", 13));

		Collections.sort(bolsaPersonas, new EdadComparator());
		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre()+ "-> edad= "+ p.getEdad());
		}

	}

}
