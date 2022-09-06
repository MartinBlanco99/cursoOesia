package lambdas.documento;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Documento> listaDocumentos = new ArrayList<Documento>();

		listaDocumentos.add(new Documento(1, "Carlos I", "Sebastian", 200));
		listaDocumentos.add(new Documento(2, "Carlos II", "Carlos", 20));
		listaDocumentos.add(new Documento(3, "Carlos I y Isabel II", "Cristobal", 125));
		listaDocumentos.add(new Documento(4, "Carlos I, el guapo", "Jonathan", 1230));
		listaDocumentos.add(new Documento(5, "Fernando v", "Lorena", 266));
		listaDocumentos.add(new Documento(6, "Felipe VI", "Carolina", 455));
		listaDocumentos.add(new Documento(2, "Carlos III", "Carlos", 230));
		
		List<Documento> lista2=listaDocumentos.stream()
		.filter((d)->d.getAutor().equals("Carlos"))
		.collect(Collectors.toList());
		
		for (Documento documento: lista2) {
			
			System.out.println(documento.getTitulo() + " - "+ documento.getAutor());
		}
		
	}

}
