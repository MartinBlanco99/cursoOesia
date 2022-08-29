package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PersonaAR {

	
	static final String INSER = "SELECT * FROM Personas";
	static final String INSERCION = "Insert into Personas values(?,?,?,?,?)";
	static final String BORRAR = "DELETE from Personas where dni=?";

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;

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

	public PersonaAR(String dni, String nombre, String apellidos, int edad, String pais) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
	}

	public PersonaAR() {
		super();
	}

	
	
	public PersonaAR(String dni) {
		super();
		this.dni = dni;
	}

	public static List<PersonaAR> buscarTodos() {

		Properties propiedades= new Properties();
		try {
			propiedades.load(new FileInputStream(new File("db.properties")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<PersonaAR> listaPersonas = new ArrayList<PersonaAR>();

		try (Connection conn = DriverManager.getConnection(propiedades.getProperty("url"), propiedades.getProperty("user"), propiedades.getProperty("passord"));
				PreparedStatement sentencia = conn.prepareStatement(INSER);

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

	public void insertar() {

		Properties propiedades= new Properties();
		try {
			propiedades.load(new FileInputStream(new File("db.properties")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (Connection conn = DriverManager.getConnection(propiedades.getProperty("url"), propiedades.getProperty("user"), propiedades.getProperty("password"));
				PreparedStatement sentencia = conn.prepareStatement(INSERCION);

		) {

			sentencia.setString(1, getDni());
			sentencia.setString(2, getNombre());
			sentencia.setString(3, getApellidos());
			sentencia.setInt(4, getEdad());
			sentencia.setString(5, getPais());
			sentencia.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void borrar() {

		Properties propiedades= new Properties();
		
		try {
			propiedades.load(new FileInputStream(new File("db.properties")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (Connection conn = DriverManager.getConnection(propiedades.getProperty("url"), propiedades.getProperty("user"), propiedades.getProperty("password"));
				PreparedStatement sentencia = conn.prepareStatement(BORRAR);

		) {

			sentencia.setString(1, getDni());
			sentencia.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
