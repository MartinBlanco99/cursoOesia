package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PrincipalProperties {

	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(new File("prueba.properties")));
			System.out.println(p.get("usuario"));
			System.out.println(p.get("clave"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
