package jdbcCurso.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbcCurso.models.Curso;
import jdbcCurso.repositories.ICursoRepository;
import jdbcCurso.repositories.jdbc.config.DataBaseHelper;

public class CursoRepositoryJDBC implements ICursoRepository {
	static final String SELECCIONAR = "SELECT * FROM Curso";
	static final String INSERTAR = "INSERT INTO curso (titulo, horas) VALUES (?,?) ";
	static final String BORRAR = "DELETE FROM curso WHERE ID=?";

	@Override
	public List<Curso> listaCursos() {
		List<Curso> lista = new ArrayList<Curso>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection con = sentencia.getConnection();) {
			try (ResultSet rs = sentencia.executeQuery();) {
				while (rs.next()) {
					Curso c = new Curso();
					c.setId(rs.getInt("id"));
					c.setTitulo(rs.getString("titulo"));
					c.setHoras(rs.getInt("horas"));
					// lista.add(c)

				}

			} catch (SQLException e1) {
				throw new RuntimeException("error de datos", e1);

			}
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);

		}
		return lista;

	}

	@Override
	public void insertar(Curso c) {

	}

	@Override
	public void borrar(Curso c) {

	}

}
