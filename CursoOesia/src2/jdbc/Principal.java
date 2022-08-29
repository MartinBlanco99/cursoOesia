package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA = "SELECT * FROM Personas";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);

		) {

			while (rs.next()) {
				System.out.println(rs.getString("dni"));
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));

			}

			System.out.println("estamos conectados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
