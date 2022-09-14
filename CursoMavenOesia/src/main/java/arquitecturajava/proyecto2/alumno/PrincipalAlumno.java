package arquitecturajava.proyecto2.alumno;

public class PrincipalAlumno {

	public static void main(String[] args) {

		Alumno alumno = new Alumno("julian");
		
		GestorNotas gestorNotas = new GestorNotas();
		gestorNotas.setAlumno(alumno);
		
		Thread thread = new Thread(gestorNotas);
		
		GestorAvisos gestorAvisos = new GestorAvisos(alumno);
		
		Thread thread2 = new Thread(gestorAvisos);
		
		
		GestorAvisos2 gestorAvisos2 = new GestorAvisos2(alumno);
		Thread thread3 = new Thread(gestorAvisos2);

		
		thread.start();
		thread2.start();
		thread3.start();
		
	}

}
