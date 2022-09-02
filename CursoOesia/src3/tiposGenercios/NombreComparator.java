package tiposGenercios;

import java.util.Comparator;

public class NombreComparator implements Comparator<PersonaIterable3> {

	@Override
	public int compare(PersonaIterable3 o1, PersonaIterable3 o2) {
		return o1.getNombre().compareTo(o2.getNombre());

	}

}
