package tiposGenercios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalFuncion {

	public static void main(String[] args) {
		List<PersonaIterable3> bolsaPersonas = new ArrayList<PersonaIterable3>();
		bolsaPersonas.add(new PersonaIterable3("miguel", 20));
		bolsaPersonas.add(new PersonaIterable3("antonio", 30));
		bolsaPersonas.add(new PersonaIterable3("ana", 10));
		bolsaPersonas.add(new PersonaIterable3("jose", 15));

		bolsaPersonas.add(new PersonaIterable3("david", 50));
		bolsaPersonas.add(new PersonaIterable3("gema", 20));

		Collections.sort(bolsaPersonas, new EdadComparator());
		for (PersonaIterable3 p : bolsaPersonas) {

			System.out.println(p.getNombre() + " -> edad= " + p.getEdad());
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

		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

		System.out.println("***********");

		Collections.sort(bolsaPersonas, (PersonaIterable3 o1, PersonaIterable3 o2) -> {
			return o1.getNombre().compareTo(o2.getNombre());

		});

		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

		System.out.println("***********");

		Collections.sort(bolsaPersonas, (o1, o2) -> {
			return o1.getNombre().compareTo(o2.getNombre());

		});

		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

		System.out.println("***********");

		Collections.sort(bolsaPersonas, (o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

		System.out.println("***********");

		Comparator<PersonaIterable3> comparador = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
		Collections.sort(bolsaPersonas, comparador);
		for (PersonaIterable3 p : bolsaPersonas) {
			System.out.println(p.getNombre());
		}

		System.out.println("-------");
		ordenarLista(bolsaPersonas, comparador);

		System.out.println("-------");

		// ordenarApellidos(bolsaPersonas2, comparador2);

		List<PersonaIterable4> bolsaPersonas2 = new ArrayList<PersonaIterable4>();
		bolsaPersonas2.add(new PersonaIterable4("julian", "blanco", 20));
		bolsaPersonas2.add(new PersonaIterable4("rosa", "lopez", 19));
		bolsaPersonas2.add(new PersonaIterable4("mencia", "suarez", 32));
		bolsaPersonas2.add(new PersonaIterable4("victor", "gimenez", 42));
		bolsaPersonas2.add(new PersonaIterable4("estefania", "martinez", 13));

		Comparator<PersonaIterable4> comparador2 = (o1, o2) -> o1.getApellidos().compareTo(o2.getApellidos());
		Collections.sort(bolsaPersonas2, comparador2);
		for (PersonaIterable4 p : bolsaPersonas2) {
			System.out.println(p.getNombre() + " " + p.getApellidos());
		}
	}

	public static void ordenarLista(List<PersonaIterable3> lista, Comparator<PersonaIterable3> comparador) {
		Collections.sort(lista, comparador);
		for (PersonaIterable3 p : lista) {
			System.out.println(p.getNombre());
		}
	}

//	public static void ordenarApellidos(List<PersonaIterable4> lista2, Comparator<PersonaIterable4> comparador2) {
//		Collections.sort(lista2, comparador2);
//		for (PersonaIterable4 p : lista2) {
//			System.out.println(p.getNombre() +" " + p.getApellidos());
//		}
//	}
//	

}
