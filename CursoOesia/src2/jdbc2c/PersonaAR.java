package jdbc2c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonaAR {

	static final String SELECCIONAR = "SELECT * FROM Personas";
	static final String SELECCIONAR_COMPRAS = "SELECT * FROM Compras where personas_dni=?";
	static final String SELECCIONAR_UNA = "SELECT * FROM Personas where dni=?";
	static final String SELECCIONAR_PERSONAS_COMPRAS = "SELECT * FROM Personas INNER JOIN Compras on Personas.dni=Compras.personas_dni ";

	static final String INSERCION = "Insert into Personas values(?,?,?,?,?)";
	static final String BORRAR = "DELETE from Personas where dni=?";

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;
	
	private List <CompraAR> listaCompra = new ArrayList<CompraAR>();

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
	
	

	public List<CompraAR> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<CompraAR> listaCompra) {
		this.listaCompra = listaCompra;
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

		List<PersonaAR> listaPersonas = new ArrayList<PersonaAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

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
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

	public void insertar() {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION, getDni(), getNombre(),
				getApellidos(), getEdad(), getPais()); Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public void borrar() {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(BORRAR, getDni());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public List<CompraAR> getCompras() {

		List<CompraAR> listaCompras = new ArrayList<CompraAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_COMPRAS, getDni());
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compra = new CompraAR();
					compra.setId(rs.getInt("id"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					compra.setDni(rs.getString("personas_dni"));
					listaCompras.add(compra);
				}

			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaCompras;

	}

	public static PersonaAR buscarUna(String dni) {

		PersonaAR persona = new PersonaAR();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_UNA, dni);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				rs.next();
					
					persona.setDni(rs.getString("dni"));
					persona.setNombre(rs.getString("nombre"));
					persona.setApellidos(rs.getString("apellidos"));
					persona.setEdad(rs.getInt("edad"));
					persona.setPais(rs.getString("pais"));
				
				
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e1) {
			throw new RuntimeException("error de datos", e1);
		}

		return persona;

	}
	
	public static List<PersonaAR> buscarTodoCompras() {

		List<PersonaAR> listaPersonas = new ArrayList<PersonaAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_PERSONAS_COMPRAS, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				PersonaAR persona = null;

				while (rs.next()) {

					// proceso fila a fila
					// cada fila tiene una persona y una compra
					if (persona == null || !persona.getDni().equals(rs.getString("dni"))) {
						persona = new PersonaAR();
						persona.setDni(rs.getString("dni"));
						persona.setNombre(rs.getString("nombre"));
						persona.setApellidos(rs.getString("apellidos"));
						persona.setEdad(rs.getInt("edad"));
						persona.setPais(rs.getString("pais"));
						listaPersonas.add(persona);
					}

					
					CompraAR compra = new CompraAR();
					compra.setDni(rs.getString("dni"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					persona.addCompra(compra);
					
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

	public void addCompra(CompraAR compra) {
		listaCompra.add(compra);
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaAR other = (PersonaAR) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	

}
