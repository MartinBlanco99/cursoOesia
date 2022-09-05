package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

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



		imprimirFiltrada(lista, null);
		System.out.println();
		imprimirFiltradaApellidos(lista, null);
		System.out.println();
		imprimirFiltradaNombre(lista, (p)->p.getNombre().equals("mencia"));
		System.out.println();
		imprimirFiltradaPorApellidos(lista, new FiltroPersonasApellidos("suarez"));
		System.out.println();
		imprimirFiltradaNombreGenerico(lista, new FiltroPersonasNombre2("estefania"));
		System.out.println();
		imprimirFiltradaNombreGenerico(lista, (p)->p.getNombre().equals("victor"));


	}

	public static void imprimirFiltrada(List<Persona> lista, String nombre) {
		for (Persona p : lista) {
			if (!p.getNombre().equals(nombre)) {
				System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
			}
		}
	}

	public static void imprimirFiltradaApellidos(List<Persona> lista, String apellidos) {
		for (Persona p : lista) {
			if (!p.getApellidos().equals(apellidos)) {
				System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
			}
		}
	}

	public static void imprimirFiltradaNombre(List<Persona> lista, FiltroPersonas filtro) {
		for (Persona p : lista) {
			if (filtro.filtrar(p)) {
				System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
			}
		}
	}

	public static void imprimirFiltradaPorApellidos(List<Persona> lista, FiltroPersonas filtro) {
		for (Persona p : lista) {
			if (filtro.filtrar(p)) {
				System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
			}
		}
	}
	
	public static void imprimirFiltradaNombreGenerico(List<Persona> lista, Filtro <Persona> filtro) {
		for (Persona p : lista) {
			if (filtro.filtrar(p)) {
				System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getEdad());
			}
		}
	}

}
