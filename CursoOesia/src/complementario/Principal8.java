package complementario;

public class Principal8 {

	public static void main(String[] args) {

		int[] lista = new int[] { 6, 7, 8, 2, 3, 4 };

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}

		int total = 0;
		for (int i = 0; i < lista.length; i++) {
			total=total+lista[i];
			
		}

		System.out.println("la suma es "+total);
	
		
		for (int i = lista.length-1; i >=0; i--) {
			System.out.println(lista[i]);

		}
		
		int mayor=0;
		
		for (int i = lista.length-1; i >=0; i--) {
			
			if (lista[i]>mayor) {
				mayor=lista[i];
			}

		}
		System.out.println("************");
		System.out.println(mayor);
	
	
	}

}
