package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal2 {

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA = "SELECT * FROM Personas";

	public static void main(String[] args) {

		String dni = "4";
		String nombre = "Josefa";
		String apellidos = "Perez";
		
		
		String consulta = "insert into personas values ('6', 'esteban','nuñez')";

		String consulta2 = "insert into personas values('" + dni + "','" + nombre + "','" + apellidos + "')";
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();

		) {

			sentencia.execute(consulta);
			sentencia.execute(consulta2);
			System.out.println("Datos insertados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
