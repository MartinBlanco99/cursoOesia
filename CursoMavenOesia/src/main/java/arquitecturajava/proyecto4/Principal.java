package arquitecturajava.proyecto4;

public class Principal {

	public static void main(String[] args) {
		Configurador c = Configurador.getInstance();
		System.out.println(c.getUrl());
		System.out.println(c.getUser());
	}

}
