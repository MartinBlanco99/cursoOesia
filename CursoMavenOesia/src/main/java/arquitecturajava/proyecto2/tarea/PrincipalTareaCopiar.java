package arquitecturajava.proyecto2.tarea;

public class PrincipalTareaCopiar {

	public static void main(String[] args) {
		Thread t = new Thread(new TareaCopiar());
		t.start();
	}

}
