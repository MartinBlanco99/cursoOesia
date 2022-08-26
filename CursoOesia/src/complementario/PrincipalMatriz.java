package complementario;

public class PrincipalMatriz {

	public static void main(String[] args) {
		
		int[][] lista= new int[][] { {1,2}, {5,6}};
		
		for (int i=0;i<lista.length;i++) {
			
			//System.out.println(lista[i]);
			for (int j=0;j<lista[i].length;j++) {
				
				System.out.println(lista[i][j]);
			}
		}
	}
}
