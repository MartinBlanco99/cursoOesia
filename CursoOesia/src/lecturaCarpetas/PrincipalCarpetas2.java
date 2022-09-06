package lecturaCarpetas;
import java.io.File;

public class PrincipalCarpetas2 {

	public static void main(String[] args) {
		File directorio = new File("C:\\Program Files\\Java");

		ficherosRecursivos(directorio, "\t");
	}

	public static void ficherosRecursivos(File directorio, String separador) {
		File[] ficheros = directorio.listFiles();

		if (ficheros != null) {
			for (int x = 0; x < ficheros.length; x++) {
				System.out.println(separador + ficheros[x].getName());
				if (ficheros[x].isDirectory()) {
					String nuevo_separador = separador + " ";
					ficherosRecursivos(ficheros[x], nuevo_separador);
				}
			}
		}

	}
}
