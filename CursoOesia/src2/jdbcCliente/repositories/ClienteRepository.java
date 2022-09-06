package jdbcCliente.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbcCliente.repositories.config.*;
import jdbcCliente.models.Cliente;

public class ClienteRepository {
	static final String SELECCIONAR = "SELECT * FROM clientes";
	static final String INSERTAR = "Insert into clientes values(?,?)";

	public List<Cliente> listarClientes() {
		List<Cliente> listaClientess = new ArrayList<Cliente>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection c = sentencia.getConnection();) {
			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setDni(rs.getInt("dni"));
					cliente.setNombre(rs.getString("nombre"));

					listaClientess.add(cliente);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);

		}
		return listaClientess;

	}

	public void insertar(Cliente cliente) {
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR, cliente.getDni(),
				cliente.getNombre()); Connection c = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}
	}

}
