package poo2;

public class Principal2 {

	public static void main(String[] args) {
		
		Alumno a= new Alumno("juan");
		
		Convocatoria ca= new Convocatoria(7);
		Convocatoria cb= new Convocatoria(3);
		
		a.setConvocatoriaA(ca);
		a.setConvocatoriaB(cb);
		System.out.println(a.getNota());

	}

}
