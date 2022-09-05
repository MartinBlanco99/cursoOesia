package lambdas.streams2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();

		Persona p = new Persona("julian", "blanco", 20);
		Persona p1 = new Persona("rosa", "lopez", 2);
		Persona p2 = new Persona("mencia", "suarez", 32);
		Persona p3 = new Persona("victor", "gimenez", 42);
		Persona p4 = new Persona("estefania", "martinez", 13);

		listaPersonas.add(p);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);

		p.addLibro(new Libro("libro", 10));
		p1.addLibro(new Libro("libro 1", 32));
		p2.addLibro(new Libro("libro 2", 26));
		p3.addLibro(new Libro("libro 3", 6));
		p4.addLibro(new Libro("libro 4", 46));

		Stream<Persona> flujo = listaPersonas.stream();
		flujo.map((persona) -> persona.getListaLibros()).forEach((listado) -> {
			listado.forEach((l) -> System.out.println(l.getPrecio()));

		});

		System.out.println();

		Stream<Persona> flujo2 = listaPersonas.stream();
		flujo2.map((persona) -> persona.getListaLibros()).flatMap((libros) -> libros.stream()).map(Libro::getPrecio)
				.forEach(System.out::println);

	}

}
