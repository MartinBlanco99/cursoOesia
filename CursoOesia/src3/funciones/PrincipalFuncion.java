package funciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import tiposGenercios.EdadComparator;
import tiposGenercios.NombreComparator;
import tiposGenercios.PersonaIterable3;

public class PrincipalFuncion {

	public static void main(String[] args) {


		List<PersonaIterable3> bolsaPersonas= new ArrayList<PersonaIterable3>();
		bolsaPersonas.add(new PersonaIterable3("miguel",20));
		bolsaPersonas.add(new PersonaIterable3("antonio",30));
		bolsaPersonas.add(new PersonaIterable3("ana",10));
		bolsaPersonas.add(new PersonaIterable3("jose",15));
		
		bolsaPersonas.add(new PersonaIterable3("david",50));
		bolsaPersonas.add(new PersonaIterable3("gema",20));
		
		Collections.sort(bolsaPersonas, new EdadComparator());
		for (PersonaIterable3 p : bolsaPersonas) {

			System.out.println(p.getNombre()+" -> edad= "+ p.getEdad());
		}
		System.out.println("***********");
		Collections.sort(bolsaPersonas, new EdadComparator());
		
		Collections.sort(bolsaPersonas, new NombreComparator());
		for (PersonaIterable3 p : bolsaPersonas) {

			System.out.println(p.getNombre());
		}
		
		System.out.println("***********");
		Collections.sort(bolsaPersonas, new Comparator<PersonaIterable3>() {

			@Override
			public int compare(PersonaIterable3 o1, PersonaIterable3 o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		
		for(PersonaIterable3 p: bolsaPersonas) {
			System.out.println(p.getNombre());
		}
		
		System.out.println("***********");
		
		Collections.sort(bolsaPersonas, (PersonaIterable3 o1, PersonaIterable3 o2) -> {
			return o1.getNombre().compareTo(o2.getNombre());
			
		});
		
		for(PersonaIterable3 p: bolsaPersonas) {
			System.out.println(p.getNombre());
		}


	}

}
