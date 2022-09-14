package arquitecturajava.proyecto2.alumno;

public class GestorAvisos2 implements Runnable {
	private Alumno alumno;

	public Alumno getAlumno() {
		return alumno;
	}

	public GestorAvisos2(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {

			try {

				synchronized (alumno) {

					alumno.wait();
					if (alumno.tieneSobresaliente()) {
						System.out.println("un sobresaliente vamos al futbol!!!");
					}

				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block

			}
		}

	}

}
