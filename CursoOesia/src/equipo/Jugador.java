package equipo;

import java.time.LocalDate;

public class Jugador implements Comparable {
	private String nombre;
	private int numero;
	private LocalDate fechaNacimeinto;

	public Jugador(String nombre, int numero, LocalDate edad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.fechaNacimeinto = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(LocalDate fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	@Override
	public int compareTo(Object o) {
		Jugador j = (Jugador) o;

		if (j.getFechaNacimeinto().isAfter(this.getFechaNacimeinto())) {

			return 1;
		} else if (j.getFechaNacimeinto().equals(this.getFechaNacimeinto())) {
			return 0;
		} else
			return -1;
	}

}
