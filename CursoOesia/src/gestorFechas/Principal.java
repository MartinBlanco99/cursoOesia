package gestorFechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<LocalDate> fechas = new ArrayList<LocalDate>();

		try (FileReader in = new FileReader(new File("fechas.txt")); BufferedReader bin = new BufferedReader(in)) {
			String linea = null;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			while ((linea = bin.readLine()) != null) {

				String[] listaTextos = linea.split(",");
				String textoFecha = listaTextos[listaTextos.length - 1];
				System.out.println(textoFecha);
				LocalDate fecha = LocalDate.parse(textoFecha, formatter);
				fechas.add(fecha);
			}

			LocalDate fechaMayor = fechas.get(0);

			for (LocalDate f : fechas) {

				if (f.isAfter(fechaMayor)) {
					fechaMayor = f;
				}
			}
			System.out.println(fechaMayor);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
