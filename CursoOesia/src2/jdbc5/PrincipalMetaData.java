package jdbc5;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jdbc2e.repositories.jdbc.config.DataBaseHelper;



public class PrincipalMetaData {

	public static void main(String[] args) {
		
	
		try {
			PreparedStatement sentencia=DataBaseHelper.crearSentenciaPreparada("select * from Personas", null);
			ResultSet rs=sentencia.executeQuery();
			ResultSetMetaData rsMetaData=rs.getMetaData();
			
			int columnas= rsMetaData.getColumnCount();
			
			System.out.println("columnas"+columnas);
			
			for(int i=1;i<=columnas;i++) {
				
				System.out.println(rsMetaData.getColumnName(i));
				System.out.println(rsMetaData.getColumnType(i));
				System.out.println(rsMetaData.getColumnTypeName(i));
				System.out.println(rsMetaData.getPrecision(i));
				System.out.println(rsMetaData.getScale(i));
				System.out.println("*******");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
