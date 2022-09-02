package jdbcCurso.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbcCurso.models.Alumno;
import jdbcCurso.repositories.IAlumnoRepository;
import jdbcCurso.repositories.jdbc.config.DataBaseHelper;

public class AlumnoRepositoryJDBC implements IAlumnoRepository {
	
	static final String SELECCIONAR = "SELECT * FROM alumno";
	static final String INSERTAR = "INSERT INTO alumno (nombre, apellido, edad)  VALUES (?,?,?)";
	static final String BORRAR = "DELETE FROM alumno WHERE id=?";

	@Override
	public List<Alumno> listaAlumnos() {
		List<Alumno> lista = new ArrayList<Alumno>();
		
		try(PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection c = sentencia.getConnection();){
			try(ResultSet rs = sentencia.executeQuery();){
				
				while (rs.next()) {
					Alumno a = new Alumno();
					a.setId(rs.getInt("id"));
					a.setNombre(rs.getString("nombre"));
					a.setApellido(rs.getString("apellido"));
					a.setEdad(rs.getInt("edad"));
					//a.setId_curso(rs.getInt("id_curso"));

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void insertar(Alumno a) {
		try(PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR,a.getNombre(), a.getApellido(), a.getEdad());
				Connection c = sentencia.getConnection();){
			sentencia.executeUpdate();
		}catch(SQLException e) {
			throw new RuntimeException("error de datos", e);

		}
		
	}

	@Override
	public void borrar(Alumno a) {
		// TODO Auto-generated method stub
		
	}

}
