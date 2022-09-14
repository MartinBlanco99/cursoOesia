package arquitecturajava.proyecto2.alumno;

public class GestorNotas implements Runnable {

	private Alumno alumno;

	public GestorNotas() {
		super();
	}

	public GestorNotas(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			double valor = Math.random() * 10;
			System.out.println("Añadiendo nota: " + valor);
			
			
			synchronized (alumno) {
				alumno.addNota(new Nota(valor));
				alumno.notify();
			}
		}
	}

}
