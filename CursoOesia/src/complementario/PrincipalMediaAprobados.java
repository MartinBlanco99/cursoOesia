package complementario;

public class PrincipalMediaAprobados {

	public static void main(String[] args) {
	
		int[] notas= new int[] { 3,4,5,6,7,8,9,2};
		
		double suma=0;
		int contador=0;
		for (int i = 0; i < notas.length; i++) {
			
			if(notas[i]>=5) {
				suma+=notas[i];
				contador++;
			}
			
		}
		System.out.println(suma/contador);
		

	}

}
