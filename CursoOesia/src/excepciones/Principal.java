package excepciones;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File fichero = new File("z:/documento.txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error");
			System.out.println("Mensaje: " + e.getMessage());
			System.out.println("Causa raiz: " + e.getCause());

			System.out.println();
			for (StackTraceElement m : e.getStackTrace())
				System.out.println("Traza: " + m);

		}
	}

}
