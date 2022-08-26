package excepciones.avanzado2;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorFichero {

	public void crearFichero(String fichero, String texto) throws SQLException,IOException {
		
		try (FileWriter fw = new FileWriter(fichero);
				Connection con = DriverManager.getConnection("dafasdf", "dfafdsf", "dafeda");) {
				fw.write(texto);
				//JOptionPane.showMessageDialog(null, "Has creado el fichero");
			} catch (SQLException | IOException e1) {

				//JOptionPane.showMessageDialog(null, e1.getMessage());
				// realizar una operacion de log del error
				throw e1;
				
			}
	}
}
