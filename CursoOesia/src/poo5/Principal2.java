package poo5;

import java.util.HashSet;

public class Principal2 {

	public static void main(String[] args) {

		HashSet<Persona> lista = new HashSet<Persona>();
		lista.add(new Persona("1","antonio"));
		lista.add(new Persona("2","gema"));
		lista.add(new Persona("3","ana"));
		Persona p4= new Persona("4","ana");
		System.out.println("**********");
		
		System.out.println(lista.contains(new Persona ("2","gema")));
		
		
	}
}
