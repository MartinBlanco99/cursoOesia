import java.util.HashMap;
import java.util.Map;

public class Prueba {

	public static void main(String[] args) {
		System.out.println(metodo(10, 6));
		
		//System.out.println();
		
//		int[] elementos = {1,3,4,5,3,2,1,2,2,1,5,5,8,9,6,6,3,4,3,1,3,5,3};
//		Map<Integer,Integer> m = new HashMap<Integer,Integer>();				
//				
//		for (int elemento: elementos){			
//		  if (m.containsKey(elemento))					
//		    m.put(elemento,m.get(elemento)+1);
//		  else
//		    m.put(elemento,1);	
		
		System.out.println(metodo("ola", "hola"));
//		}
		
	}

	static boolean metodo(int a, int b) {
		return (a > b);
	}
	
	static boolean metodo(String cadena1, String cadena2)
	{
	  return (!cadena1.equals(cadena2));
	}

}
