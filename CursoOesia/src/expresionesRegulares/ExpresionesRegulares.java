package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		Pattern patron =  Pattern.compile("a");
		Matcher encontrar = patron.matcher("la casa verde esta lejos");
		boolean encontrados = encontrar.find();
		
		if(encontrados) {
			System.out.println("Se encontro");
		}
	}

}
