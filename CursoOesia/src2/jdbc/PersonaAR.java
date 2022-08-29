package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonaAR {
	

	static final String URL = "jdbc:mysql://localhost/cursoOesia";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA = "SELECT * FROM Personas where nombre=? and apellidos=?";
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;

	
	
	public PersonaAR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaAR(String dni, String nombre, String apellidos, int edad, String pais) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static List<PersonaAR>buscarTodo(){
		List<PersonaAR> listaPersonas = new ArrayList<PersonaAR>();

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);

		) {

			try (ResultSet rs = sentencia.executeQuery();) {

			
				while (rs.next()) {
					PersonaAR persona = new PersonaAR();
					persona.setDni(rs.getString("dni"));
					persona.setNombre(rs.getString("nombre"));
					persona.setApellidos(rs.getString("apellidos"));
					persona.setEdad(rs.getInt("edad"));
					persona.setPais(rs.getString("pais"));
					listaPersonas.add(persona);

				}
			} catch (SQLException e) {

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaPersonas;

	}
}
