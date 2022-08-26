package poo2;

public class Principal {
public static void main(String[] args) {
	
	
	Portatil p= new Portatil("samsung",1000);
	Cargador c= new Cargador("belking","usbc",100);
	System.out.println(c.getPrecio());
	System.out.println(p.getPrecio());
	p.setCargador(c);
	
	System.out.println(p.getCargador().getTipo());
	
}
}
