package arquitecturajava.proyecto2;

public class PrincipalTareaCopiaryBorrar {

	public static void main(String[] args) {
		Thread t = new Thread(new TareaCopiar());
		Thread t2 = new Thread(new TareaBorrar(t));

		t.start();
		t2.start();
	}

}
