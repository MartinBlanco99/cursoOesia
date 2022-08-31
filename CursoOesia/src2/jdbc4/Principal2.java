package jdbc4;

import java.util.List;

import jdbc4.models.Capitulo;
import jdbc4.repositories.CapituloRepository;

public class Principal2 {

	public static void main(String[] args) {
		CapituloRepository repositorio = new CapituloRepository();
		List<Capitulo>lista = repositorio.listarCapitulos();
		for(Capitulo c : lista) {
			System.out.println(c.getNumCapitulo());
			System.out.println(c.getId_libro());
		}
		
		System.out.println();
		
		//Capitulo c1 = new Capitulo(1,100, 1);
		//repositorio.insertar(c1);
		
		//Capitulo c2 = new Capitulo(2,6, 2);
		//repositorio.insertar(c2);
		
		Capitulo c3 = new Capitulo(3,20, 1);
		repositorio.insertar(c3);
		
		Capitulo c4 = new Capitulo(4,30, 2);
		repositorio.insertar(c4);
		
		
		List<Capitulo>lista2 = repositorio.listarCapitulos();
		for(Capitulo cap : lista2) {
			System.out.println(cap.getNumCapitulo());
			System.out.println(cap.getId_libro());
		}
	}

}
