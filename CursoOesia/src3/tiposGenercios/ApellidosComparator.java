package tiposGenercios;

import java.util.Comparator;

public class ApellidosComparator implements Comparator<PersonaIterable4>{

	@Override
	public int compare(PersonaIterable4 o1, PersonaIterable4 o2) {
		// TODO Auto-generated method stub
		return o1.getApellidos().compareTo(o2.getApellidos());
	}

}
