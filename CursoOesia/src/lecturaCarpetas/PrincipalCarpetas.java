package lecturaCarpetas;
import java.io.File;

public class PrincipalCarpetas {

	public static void main(String[] args) {
		File directorio = new File("C:\\\\Program Files\\\\Java");

		lecturaCarpetastecursividad(directorio);
	}

	public static void lecturaCarpetastecursividad(File directorio) {

		File[] ficheros = directorio.listFiles();
		if (ficheros != null) {
			for (int x = 0; x < ficheros.length; x++) {
				System.out.println(ficheros[x].getName());
				if (ficheros[x].isDirectory()) {
					lecturaCarpetastecursividad(ficheros[x]);
				}
			}
		}
	}
}
