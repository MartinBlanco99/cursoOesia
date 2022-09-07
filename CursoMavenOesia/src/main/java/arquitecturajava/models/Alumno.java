package arquitecturajava.models;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private String nombre;
	private List<Nota2> notasLista = new ArrayList<Nota2>();

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public List<Nota2> getNotasLista() {
		return notasLista;
	}

	public void setNotasLista(List<Nota2> notasLista) {
		this.notasLista = notasLista;
	}

	public void addNota(Nota2 nota) {
		notasLista.add(nota);
	}
	
	public void removeNota(Nota2 nota) {
		notasLista.remove(nota);
	}

	public boolean apruebaElCurso() {
		double total = 0;

		for (Nota2 n : notasLista) {
			total += n.getValor();
		}
		return total / notasLista.size() >= 5;
	}

}
