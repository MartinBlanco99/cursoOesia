package jdbc3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FacturaAR {

	static final String INSERTAR = "Insert into Facturas values(?,?,?)";
	static final String SELECCIONAR = "SELECT * FROM Facturas";

	
	private int numero;
	private String concepto;
	private int importe;

	public FacturaAR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaAR(int numero) {
		super();
		this.numero = numero;
	}

	public FacturaAR(int numero, String concepto, int importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	public static List<FacturaAR> buscarTodo(){
		
		List<FacturaAR> lista = new ArrayList<FacturaAR>();
		
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					FacturaAR facturaAR = new FacturaAR();
					facturaAR.setNumero(rs.getInt("numero"));
					facturaAR.setConcepto(rs.getString("concepto"));
					facturaAR.setImporte(rs.getInt("importe"));
					lista.add(facturaAR);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return lista;

		
	}
	
	public void insertar() {
		try(PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERTAR, getNumero(), getConcepto(), getImporte());
			Connection con = sentencia.getConnection();	){
			sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("error de datos", e);
		}
	}
		

}
