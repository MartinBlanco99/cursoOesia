package jdbc4.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc4.models.Libro;
import jdbc4.repositories.db.DataBaseHelper;

public class LibroRepository {

	static final String INSERTAR = "Insert into libro values(?,?,?,?)";
	static final String SELECCIONAR = "SELECT * FROM Libro";
	static final String SELECCIONAR_LIBROS_CAPITULOS = "SELECT * FROM Libros inner join Capitulos on libros.id = capitulos.id_libro";


	public List<Libro> listarLibros() {
		List<Libro> listaLibros = new ArrayList<Libro>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection c = sentencia.getConnection();) {
			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Libro libro = new Libro();
					libro.setId(rs.getInt("id"));
					libro.setIsbn(rs.getString("isbn"));
					libro.setTitulo(rs.getString("titulo"));
					libro.setAutor(rs.getString("autor"));
					listaLibros.add(libro);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);

		}
		return listaLibros;

	}

	public void insertar(Libro l) {
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR, l.getId(), l.getIsbn(),
				l.getTitulo(), l.getAutor()); Connection c = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}
	}
}
