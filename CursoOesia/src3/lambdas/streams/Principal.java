package lambdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("julian", "blanco", 20));
		lista.add(new Persona("rosa", "lopez", 2));
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
		
		System.out.println();
		System.out.println("-----JUBILADOS----");
		
		Stream<Persona> flujo2	 = lista.stream();

		flujo2.filter((p) -> p.getEdad() > 65)
		.map((p)->p.getNombre())
		.map((n)->n.toUpperCase())
		.forEach((nombre) -> {
			System.out.println(nombre);
		});
		
		System.out.println();
		System.out.println("----MENORES DE EDAD----");
		
		Stream<Persona> flujo3	 = lista.stream();

		flujo3
		.filter((p) -> p.getEdad() < 18)
		.peek((p)->System.out.println(p.getNombre()))
		.map((p)->p.getNombre())
		.peek((nombre)->System.out.println(nombre))
		.map((nombre)->nombre.toUpperCase())
		.forEach((nombre) -> {
			System.out.println("*****" + nombre+ "*****");
		});
		
		System.out.println();
		
		Stream<Persona> flujo4	 = lista.stream();
		Predicate<Persona>filtroEdad= (p)->p.getEdad()>50;
		
		flujo4
		.filter(filtroEdad)
		.peek((p)->System.out.println(p.getNombre()))
		.map((p)->p.getNombre())
		.peek((nombre)->System.out.println(nombre))
		.map((nombre)->nombre.toUpperCase())
		.forEach((nombre) -> {
			System.out.println("*****" + nombre+ "*****");
		});
		
		
		System.out.println();
		Stream<Persona> flujo5	 = lista.stream();

		flujo5
		.filter(Persona::estaJubilado)
		.map((p)->p.getNombre())
		.map((n)->n.toUpperCase())
		.forEach((nombre) -> {
			System.out.println(nombre);
		});


	}

}
