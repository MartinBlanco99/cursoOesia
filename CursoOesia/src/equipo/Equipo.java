package equipo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {

	List<Jugador> listaJugadores = new ArrayList<Jugador>();

	public void addJugador(Jugador j) {
		listaJugadores.add(j);
	}

	public double getEdadMedia() {
		double total = 0;
		LocalDate fechaActual = LocalDate.now();

		for (Jugador jug : listaJugadores) {
			LocalDate fechaNacimiento = jug.getFechaNacimeinto();
			Period p = Period.between(fechaNacimiento, fechaActual);
			int anos = p.getYears();
			total += anos;

		}
		return total / listaJugadores.size();
	}

	public Jugador getJugadorJoven() {
		Jugador j = listaJugadores.get(0);

		for (Jugador jugador : listaJugadores) {
			if (jugador.getFechaNacimeinto().isAfter(j.getFechaNacimeinto())) {
				j = jugador;
			}
		}
		return j;
	}

	public Jugador getJugadorMayor() {
		Jugador j = listaJugadores.get(0);

		for (Jugador jugador : listaJugadores) {
			if (jugador.getFechaNacimeinto().isBefore(j.getFechaNacimeinto())) {
				j = jugador;
			}
		}
		return j;
	}

	public List<Jugador> getCapitanes() {

		Collections.sort(listaJugadores);
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		lista.add(listaJugadores.get(listaJugadores.size() - 1));
		lista.add(listaJugadores.get(listaJugadores.size() - 2));
		lista.add(listaJugadores.get(listaJugadores.size() - 3));

		return lista;
	}

}
