package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares2 {

	public static void main(String[] args) {
		Pattern patron = Pattern.compile("a");
		Matcher encontrar = patron.matcher("la casa verde estaria muy lejos");

		while (encontrar.find()) {
			System.out.println("encontrado");
			System.out.println(encontrar.start());
			System.out.println(encontrar.end());
		}
	}

}
