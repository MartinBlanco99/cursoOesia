package arquitecturajava.proyecto2.alumno;

public class GestorAvisos implements Runnable {

	private Alumno alumno;

	public Alumno getAlumno() {
		return alumno;
	}

	public GestorAvisos(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(3000);
				if(alumno.tieneSobresaliente())	{
					System.out.println("Sacaste un sobresaliente");
				}
					} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
