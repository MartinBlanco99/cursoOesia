package prueba1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class ObtenerAnhoFecha {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();

		try (FileReader in = new FileReader(new File("fecha.txt")); BufferedReader bin = new BufferedReader(in)) {
			String linea = null;

			while ((linea = bin.readLine()) != null) {
				System.out.println(calendario.get(Calendar.YEAR));

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
