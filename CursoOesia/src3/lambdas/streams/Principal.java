package lambdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lambdas.Persona;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("julian", "blanco", 20));
		lista.add(new Persona("rosa", "lopez", 19));
		lista.add(new Persona("mencia", "suarez", 32));
		lista.add(new Persona("victor", "gimenez", 42));
		lista.add(new Persona("estefania", "martinez", 13));
		lista.add(new Persona("rogelio", "colon", 66));
		lista.add(new Persona("lidia", "rodriguez", 90));
		lista.add(new Persona("patricio", "pachin", 26));

		Stream<Persona> flujo = lista.stream();

		flujo.filter((p) -> p.getEdad() > 30)
		.map((p)->p.getNombre())
		.map((n)->n.toUpperCase())
		.forEach((nombre) -> {
			System.out.println(nombre);
		});

	}

}
