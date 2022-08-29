package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal5 {

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA = "SELECT * FROM Personas where nombre=? and apellidos=?";

	public static void main(String[] args) {

		String nombre = "perico";
		String apellidos = "palote";

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);

		) {

			sentencia.setString(1, nombre);
			sentencia.setString(2, apellidos);
			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {

					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getString("apellidos"));
				}
			} catch (SQLException e) {

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
