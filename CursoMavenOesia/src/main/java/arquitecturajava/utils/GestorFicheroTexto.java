package arquitecturajava.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorFicheroTexto {

	private List<String> lineas = new ArrayList<String>();

	private String nombreFichero;

	public GestorFicheroTexto(String nombreFichero) throws IOException {
		super();
		this.nombreFichero = nombreFichero;

		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));

		String st;
		while ((st = br.readLine()) != null) {
			lineas.add(st);
		}
	}

	public List<String> getLineas() {
		return lineas;
	}

	public void setLineas(List<String> lineas) {
		this.lineas = lineas;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public int getNumeroLineas() {
		return lineas.size();
	}

	public String getLinea(int posicion) {
		return lineas.get(posicion);
	}

	public boolean contieneTexto(String texto) {

		for (String linea : lineas) {

			if (linea.contains(texto)) {
				return true;
			}
		}
		return false;

	}

}
