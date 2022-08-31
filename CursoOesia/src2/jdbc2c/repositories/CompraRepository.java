package jdbc2c.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc2c.models.Compra;
import jdbc2c.repositories.db.DataBaseHelper;

public class CompraRepository {

	static final String SELECCIONAR = "SELECT * FROM Compras";
	static final String INSERCION = "Insert into Compras (concepto,importe,personas_dni) values(?,?,?)";
	static final String BORRAR = "DELETE from Compras where id=?";
	static final String ORDENARIMPORTE = "SELECT * FROM Compras ORDER BY importe ";
	static final String ORDENARCONCEPTO = "SELECT * FROM Compras ORDER BY concepto ";
	static final String ORDENAR = "SELECT * FROM Compras ORDER BY %s ";

	public static List<Compra> buscarTodos() {

		List<Compra> listaCompras = new ArrayList<Compra>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(ORDENARIMPORTE, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
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

	public void insertar(Compra c) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION, c.getConcepto(),
				c.getImporte(), c.getDni()); Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public void borrar(Compra c) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(BORRAR, c.getDni());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public static List<Compra> buscarTodosPorImporte() {

		List<Compra> listaCompras = new ArrayList<Compra>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
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

	public static List<Compra> buscarTodosPorConcepto() {

		List<Compra> listaComprasConcepto = new ArrayList<Compra>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(ORDENARCONCEPTO, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
					compra.setId(rs.getInt("id"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					compra.setDni(rs.getString("personas_dni"));

					listaComprasConcepto.add(compra);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaComprasConcepto;

	}

	public static List<Compra> buscarTodosOrdenados(String campo) {

		List<Compra> listaPersonas = new ArrayList<Compra>();

		String SQL_Final = String.format(ORDENAR, campo);
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SQL_Final);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
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
