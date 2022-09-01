package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalTransaccion {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cursoOesia";
	static final String USER = "root";
	static final String PASS = "";
	static final String INSERT = "insert into Personas  (dni,nombre,apellidos,edad,pais) values ('125', 'pedro','perez',20,'españa')";
	static final String INSERT2 = "insert into Personas  (dni,nombre,apellidos,edad,pais) values ('110', 'pedro','perez',20,'españa')";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)

		{
			conn.setAutoCommit(false);

			try (Statement stmt = conn.createStatement();) {

				stmt.executeUpdate(INSERT);
				stmt.executeUpdate(INSERT2);
				conn.commit();
				System.out.println("todo ok");
			} catch (SQLException e) {

				conn.rollback();
				e.printStackTrace();
			}

	
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
