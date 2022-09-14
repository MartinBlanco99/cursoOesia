package arquitecturajava.proyecto2.alumno;

public class PrincipalAlumno {

	public static void main(String[] args) {

		Alumno alumno = new Alumno("julian");
		
		GestorNotas gestorNotas = new GestorNotas();
		gestorNotas.setAlumno(alumno);
		
		Thread thread = new Thread(gestorNotas);
		
		GestorAvisos gestorAvisos = new GestorAvisos(alumno);
		
		Thread thread2 = new Thread(gestorAvisos);
		
		thread.start();
		thread2.start();
		
		
	}

}
