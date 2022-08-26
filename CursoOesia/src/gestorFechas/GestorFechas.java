package gestorFechas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*Leer un fichero con fechas separadas por comas
 * 
 * Convertir las fechas a Date
 * 
 * Sacar por pantalla la fecha más antigua

 */
public class GestorFechas {
	
	public String leerFichero(String fichero) throws Exception {
		String linea = "";
		String texto = "";
		try (FileReader fr = new FileReader("fechas.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				String [] lista = linea.split(",");
				
				
				texto += linea;
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return texto;
		
	}

}
