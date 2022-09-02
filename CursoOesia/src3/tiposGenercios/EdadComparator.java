package tiposGenercios;

import java.util.Comparator;

public class EdadComparator implements Comparator<PersonaIterable3> {

	@Override
	public int compare(PersonaIterable3 o1, PersonaIterable3 o2) {
		if (o1.getEdad() > o2.getEdad()) {
			return 1;

		} else if (o1.getEdad() == o2.getEdad()) {
			return 0;
		} else
			return -1;
	}

}
