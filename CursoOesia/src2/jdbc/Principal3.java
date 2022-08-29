package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal3 {

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA = "SELECT * FROM Personas";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("dame el dni");
			String dni = sc.next();

			System.out.println("dame el nombre");
			String nombre = sc.next();

			System.out.println("dame apellidos");
			String apellidos = sc.next();
			String consulta2 = "insert into personas values('" + dni + "','" + nombre + "','" + apellidos + "')";
			try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
					Statement sentencia = conn.createStatement();

			) {

				sentencia.execute(consulta2);
				System.out.println("Datos insertados");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
