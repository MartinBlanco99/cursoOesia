package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal4 {

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("dame el dni");
		String dni = sc.next();
		System.out.println("dame el nombre");
		String nombre = sc.next();
		System.out.println("dame el apellido");
		String apellidos = sc.next();
		String consulta = "insert into Personas (dni,nombre,apellidos) values ( ?,?,? ) ";
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(consulta)

		) {
			sentencia.setString(1, dni);
			sentencia.setString(2, nombre);
			sentencia.setString(3, apellidos);

			sentencia.executeUpdate();
			System.out.println("hemos insertado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
