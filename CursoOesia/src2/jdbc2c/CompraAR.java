package jdbc2c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CompraAR {

	static final String SELECCIONAR = "SELECT * FROM Compras";
	static final String INSERCION = "Insert into Compras (concepto,importe,personas_dni) values(?,?,?)";
	static final String BORRAR = "DELETE from Compras where id=?";
	static final String ORDENARIMPORTE = "SELECT * FROM Compras ORDER BY importe ";
	static final String ORDENARCONCEPTO = "SELECT * FROM Compras ORDER BY concepto ";
	static final String ORDENAR = "SELECT * FROM Compras ORDER BY %s ";


	private int id;
	private String concepto;
	private double importe;
	private String dni;
	

	public CompraAR() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public CompraAR(int id) {
		super();
		this.id = id;
	}



	public CompraAR(String concepto, double importe, String dni) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.dni = dni;
	}
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getConcepto() {
		return concepto;
	}



	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}



	public double getImporte() {
		return importe;
	}



	public void setImporte(double importe) {
		this.importe = importe;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public static List<CompraAR> buscarTodos() {

		List<CompraAR> listaCompras = new ArrayList<CompraAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(ORDENARIMPORTE, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compraAR = new CompraAR();
					compraAR.setId(rs.getInt("id"));
					compraAR.setConcepto(rs.getString("concepto"));
					compraAR.setImporte(rs.getDouble("importe"));
					compraAR.setDni(rs.getString("personas_dni"));
					
					listaCompras.add(compraAR);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaCompras;

	}

	public void insertar() {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION,  getConcepto(),
				getImporte(), getDni()); Connection conn = sentencia.getConnection();) {
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
	
	public static List<CompraAR> buscarTodosPorImporte() {

		List<CompraAR> listaCompras = new ArrayList<CompraAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compraAR = new CompraAR();
					compraAR.setId(rs.getInt("id"));
					compraAR.setConcepto(rs.getString("concepto"));
					compraAR.setImporte(rs.getDouble("importe"));
					compraAR.setDni(rs.getString("personas_dni"));
					
					listaCompras.add(compraAR);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaCompras;

	}
	
	public static List<CompraAR> buscarTodosPorConcepto() {

		List<CompraAR> listaComprasConcepto = new ArrayList<CompraAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(ORDENARCONCEPTO, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compraAR = new CompraAR();
					compraAR.setId(rs.getInt("id"));
					compraAR.setConcepto(rs.getString("concepto"));
					compraAR.setImporte(rs.getDouble("importe"));
					compraAR.setDni(rs.getString("personas_dni"));
					
					listaComprasConcepto.add(compraAR);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaComprasConcepto;

	}
	
	public static List<CompraAR> buscarTodosOrdenados(String campo) {

		List<CompraAR> listaPersonas = new ArrayList<CompraAR>();

		String SQL_Final= String.format(ORDENAR,campo);
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SQL_Final);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compra = new CompraAR();
					compra.setId(rs.getInt("id"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					compra.setDni(rs.getString("personas_dni"));
					listaPersonas.add(compra);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

}
