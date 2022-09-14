package BaseDeDatos.libro.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BaseDeDatos.libro.model.Libro;
import BaseDeDatos.libro.repositories.ILibroRepository;
import BaseDeDatos.libro.repositories.config.DataBaseHelper;

public class LibroRepository implements ILibroRepository {

	static final String SELECCIONAR = "SELECT * FROM libro";
	static final String INSERTAR = "INSERT INTO libro (isbn, titulo, autor)  VALUES (?,?,?)";

	@Override
	public void insertar(Libro libro) {
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR, libro.getIsbn(),
				libro.getTitulo(), libro.getAutor()); Connection connection = sentencia.getConnection();) {
			sentencia.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);

		}

	}

	@Override
	public List<Libro> listarLibros() {
		List<Libro> listaLibros = new ArrayList<Libro>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection connection = sentencia.getConnection();) {
			try (ResultSet resultSet = sentencia.executeQuery();) {

				while (resultSet.next()) {
					Libro libro = new Libro();
					libro.setIsbn(resultSet.getInt("isbn"));
					libro.setTitulo(resultSet.getString("titulo"));
					libro.setAutor(resultSet.getString("autor"));

					listaLibros.add(libro);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;
	}

}
