package complementario;

public class Principal9Funcion {

	public static void main(String[] args) {
		
		
		//invocamos la funcion desde aqui y pasamos parametros
		System.out.println(sumarNTerminos(10));
		System.out.println(sumarNTerminos(3));
		
	}

	// una funcion es un blqoue e código reutilizable
	//una parte es su declaracion y otra parte es su invocacion
	public static double sumarNTerminos(int n) {
		
		int total=0;
		for (int i=0;i<n;i++) {
			
			total+=i;
		}
		return total;
	}

}
