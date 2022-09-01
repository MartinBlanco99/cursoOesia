package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares3 {

	public static void main(String[] args) {
		Pattern patron = Pattern.compile("\\d{2}");
		Matcher encontrar = patron.matcher("la casa 20 verde estaria muy lejos a 10 kilometros");

		while (encontrar.find()) {
			System.out.println("encontrado");
			System.out.println(encontrar.start());
			System.out.println(encontrar.end());
		}
	}

}
