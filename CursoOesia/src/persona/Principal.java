package persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		String linea = "";
		String texto = "";
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		try (FileReader fr = new FileReader("personas.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				String[] lista = linea.split(",");

				Persona p = null;
				for (int i = 0; i < lista.length; i++) {

					SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

					p = new Persona(lista[0], lista[1], f.parse(lista[2]));

				}
				listaPersonas.add(p);
			}

		} catch (IOException e1) {
			e1.printStackTrace();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Persona p : listaPersonas) {

			System.out.println(p.getNombre());
			System.out.println(p.getApellido());
			System.out.println(p.getFechaNacimiento());

		}

		Persona mayor = listaPersonas.get(0);

		for (Persona p : listaPersonas) {

			if (p.esMayor(mayor)) {
				mayor=p;
			}
		}

		System.out.println(mayor.getNombre());

	}

}
