package arquitecturajava.proyecto2.alumno;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;

	private List<Nota> listaNotas = new ArrayList<Nota>();

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized void addNota(Nota nota) {
		listaNotas.add(nota);
	}

	public boolean tieneSobresaliente() {
		for (Nota n : listaNotas) {

			if (n.esSobresaliente()) {
				return true;
			}
		}
		return false;

	}

}
