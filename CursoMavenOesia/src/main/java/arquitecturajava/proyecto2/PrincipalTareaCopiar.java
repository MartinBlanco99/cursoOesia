package arquitecturajava.proyecto2;

public class PrincipalTareaCopiar {

	public static void main(String[] args) {
		Thread t = new Thread(new TareaCopiar());
		t.start();
	}

}
