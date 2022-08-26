package excepciones;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal2 {

	public static void main(String[] args) {
		File fichero = new File("documento.txt");
		try {
			fichero.createNewFile();
			Connection con = DriverManager.getConnection("aaa", "ssss", "ddd");
		} catch (IOException e) {

			System.out.println("Mensaje: " + e.getMessage());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede acceder a la BD-> " + e.getMessage());
		} finally {
			System.out.println("Programa cierra los recursos");
		}
	}

}
