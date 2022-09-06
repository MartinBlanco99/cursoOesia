package jdbcCliente.repositories.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Configurador {
	private String url;
	private String user;
	private String password;
	private static Configurador configurador;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private Configurador() {
		
		Properties propiedades= new Properties();
		try {
			propiedades.load(new FileInputStream(new File("clientes.properties")));
			url= propiedades.getProperty("url");
			user= propiedades.getProperty("user");
			password= propiedades.getProperty("password");
		} catch (IOException e1) {
			 throw new RuntimeException("error configurador",e1);
		}
		
	}
	
	public static Configurador getInstance() {
		
		//la construccion de un objeto en memoria
		if (configurador==null) {
			
			configurador= new Configurador();
		}
		return configurador;
	}
}
