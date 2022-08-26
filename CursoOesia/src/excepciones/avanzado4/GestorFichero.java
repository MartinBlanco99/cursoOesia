package excepciones.avanzado4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorFichero {
	public void crearFichero(String fichero, String texto) throws GestorFicheroException {

		try (FileWriter fw = new FileWriter(fichero);
				Connection con = DriverManager.getConnection("dafasdf", "dfafdsf", "dafeda");) {
			fw.write(texto);
			// JOptionPane.showMessageDialog(null, "Has creado el fichero");
		} catch (SQLException | IOException e1) {

			// System.out.println(e1.getMessage());
			e1.printStackTrace();
			// JOptionPane.showMessageDialog(null, e1.getMessage());
			// realizar una operacion de log del error
			throw new GestorFicheroException("Error configurando fichero de arranque", e1);

		}
	}

	public String leerFichero(String fichero) throws GestorFicheroException {
		String linea = "";
		String texto = "";
		try (FileReader fr = new FileReader(fichero); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				texto += linea;
			}

		} catch (IOException e1) {
			e1.printStackTrace();
			throw new GestorFicheroException("Error configurando fichero de arranque", e1);
		}

		return texto;
	}
}
