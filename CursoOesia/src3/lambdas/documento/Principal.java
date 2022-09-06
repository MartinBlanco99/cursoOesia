package lambdas.documento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<Documento> listaDocumentos = new ArrayList<Documento>();

		listaDocumentos.add(new Documento(1, "Carlos I", "Sebastian", 200));
		listaDocumentos.add(new Documento(2, "Carlos II", "Carlos", 20));
		listaDocumentos.add(new Documento(3, "Carlos I y Isabel II", "Cristobal", 125));
		listaDocumentos.add(new Documento(4, "Carlos I, el guapo", "Jonathan", 1230));
		listaDocumentos.add(new Documento(5, "Fernando v", "Lorena", 266));
		listaDocumentos.add(new Documento(6, "Felipe VI", "Carolina", 455));
		listaDocumentos.add(new Documento(2, "Carlos III", "Carlos", 230));

		for (Documento doc : listaDocumentos) {
			System.out.println(doc.getAutor());
		}

		System.out.println();
		autoresEmpiezanEnC(listaDocumentos);

		System.out.println();

		List<Documento> lista = listaDocumentos.stream().filter((d) -> d.getAutor().equals("Carlos"))
				.collect(Collectors.toList());

		for (Documento docus : listaDocumentos) {
			System.out.println(docus.getTitulo() + " - " + docus.getAutor());
		}

		System.out.println();

		OptionalInt total = lista.stream().filter((d) -> d.getAutor().equals("Carlos")).mapToInt((d) -> d.getPaginas())
				.reduce((a, p) -> a + p);

		if (total.isPresent()) {
			System.out.println(total.getAsInt());
		}

		System.out.println();
		
		int total2 = lista.stream().filter((d) -> d.getAutor().equals("Carlos")).mapToInt((d) -> d.getPaginas()).sum();

		System.out.println(total2);

	}

	public static void autoresEmpiezanEnC(List<Documento> lista) {
		for (Documento d : lista) {
			if (d.getAutor().startsWith("C")) {
				System.out.println(d.getAutor());
			}
		}
	}

}
