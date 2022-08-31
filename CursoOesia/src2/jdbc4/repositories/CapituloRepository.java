package jdbc4.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc4.models.Capitulo;
import jdbc4.repositories.db.DataBaseHelper;

public class CapituloRepository {

	static final String SELECCIONAR = "SELECT * FROM Capitulo";
	static final String INSERTAR = "Insert into Capitulo (numCapitulo, id_libro) values(?,?)";

	public  List<Capitulo> listarCapitulos() {
		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection c = sentencia.getConnection();) {
			try (ResultSet rs = sentencia.executeQuery();) {
				while (rs.next()) {
					Capitulo cap = new Capitulo();
					cap.setId(rs.getInt("id"));
					cap.setNumCapitulo(rs.getInt("numCapitulo"));
					cap.setId_libro(rs.getInt("id_libro"));
					listaCapitulos.add(cap);

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCapitulos;

	}
	
	public void insertar(Capitulo c) {
		try(PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR,c.getNumCapitulo(), c.getId_libro());
				Connection con = sentencia.getConnection();){
			sentencia.executeUpdate();
		}catch (SQLException e) {
			throw new RuntimeException("error de datos", e);		}
	}

}
