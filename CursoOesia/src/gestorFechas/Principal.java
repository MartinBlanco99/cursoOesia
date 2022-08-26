package gestorFechas;

public class Principal {

	public static void main(String[] args) {

		GestorFechas gf = new GestorFechas();
		try {
			gf.leerFichero("fechas.txt");
			System.out.println(gf.leerFichero("fechas.txt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
