package excepciones.avanzado3;

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
				//JOptionPane.showMessageDialog(null, "Has creado el fichero");
			} catch (SQLException | IOException e1) {

				//System.out.println(e1.getMessage());
				e1.printStackTrace();
				//JOptionPane.showMessageDialog(null, e1.getMessage());
				// realizar una operacion de log del error
				throw new GestorFicheroException("Error configurando fichero de arranque", e1);
				
			}
	}
}
