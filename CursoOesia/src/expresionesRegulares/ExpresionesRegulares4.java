package expresionesRegulares;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares4 {

	public static void main(String[] args) {

		String linea = "";
		Pattern patron = Pattern.compile("\\d{2,5}");
		try (FileReader fr = new FileReader("datosRegulares.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				int contador = 0;
				System.out.println(linea);
				Matcher encontrar = patron.matcher(linea);

				while (encontrar.find()) {
					contador++;
					System.out.println(encontrar.group());
				}

				System.out.println(contador);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
