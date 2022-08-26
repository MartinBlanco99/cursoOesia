package poo3;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona p= new Persona("juan");
		
		System.out.println(p.getNombre());
		Deportista d= new Deportista("pedro");
		
		d.setDeporte("padel");
		System.out.println(d.getNombre());
		System.out.println(d.getDeporte());
		p.andar();
		d.andar();
	}

}
