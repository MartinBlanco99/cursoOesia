package complementario;

public class PrincipalMedia {

	public static void main(String[] args) {
	
		int[] notas= new int[] { 3,4,5,6,7,8,9,2};
		
		double suma=0;
		
		for (int i = 0; i < notas.length; i++) {
			
			suma+=notas[i];
		}
		System.out.println(suma/notas.length);
		

	}

}
