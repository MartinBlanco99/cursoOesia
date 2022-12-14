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

	public Nota2 notaMayor() {

		Nota2 notaMayor = notasLista.get(0);

		for (Nota2 n : notasLista) {
			if (notaMayor.getValor() < n.getValor()) {
				notaMayor = n;
			}
		}
		return notaMayor;

	}

	public List<Nota2> suspensos() {
		List<Nota2> suspensos = new ArrayList<Nota2>();

		for (Nota2 n : notasLista) {
			if (n.getValor() < 5) {
				suspensos.add(n);
			}
		}
		return suspensos;
	}

	public double getNumeroSobreSalientes() {

		int total = 0;

		for (Nota2 n : notasLista) {

			if (n.getCalificacion().equals("Sobresaliente")) {

				total++;
			}
		}

		return total;

	}
}
