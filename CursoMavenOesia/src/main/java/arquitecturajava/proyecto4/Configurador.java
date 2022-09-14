package arquitecturajava.proyecto4;

public class Configurador {

	private String url;
	private String user;
	
	private static Configurador configurador;
	
	
	public Configurador(String url, String user) {
		super();
		this.url = url;
		this.user = user;
	}
	private Configurador() {
		url = "esta es la url";
		user = "usuario";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	public static Configurador getInstance() {
		if (configurador == null) {
			configurador = new Configurador();
		}
		return configurador;
	}
	
}
