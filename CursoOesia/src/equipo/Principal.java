package equipo;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Equipo e = new Equipo();

		e.addJugador(new Jugador("Martin", 10, LocalDate.of(1999, 8, 8)));
		e.addJugador(new Jugador("Pepe", 1, LocalDate.of(2000, 1, 10)));
		e.addJugador(new Jugador("Luis", 6, LocalDate.of(2002, 2, 25)));
		e.addJugador(new Jugador("Jese", 12, LocalDate.of(2010, 2, 25)));
		e.addJugador(new Jugador("Gerardo", 8, LocalDate.of(1985, 2, 25)));
		e.addJugador(new Jugador("Leo", 26, LocalDate.of(2006, 2, 25)));

		System.out.println(e.getEdadMedia());
		System.out.println(e.getJugadorJoven().getNombre());
		System.out.println(e.getJugadorMayor().getNombre());

		System.out.println();

		for (Jugador j : e.getCapitanes()) {
			System.out.println(j.getNombre());
		}
	}

}
