package excepciones.avanzado5;

public class Configurador {

	private String configuracion;

	public Configurador() throws GestorFicheroException {
		super();
		GestorFichero g = new GestorFichero();
		try {
			configuracion = g.leerFichero("nuevo.txt");
		} catch (GestorFicheroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Fichero de configuracion", e);
		}

	}

	public String getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(String configuracion) {
		this.configuracion = configuracion;
	}
}
