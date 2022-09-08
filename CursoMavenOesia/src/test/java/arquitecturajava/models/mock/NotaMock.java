package arquitecturajava.models.mock;

import arquitecturajava.models.Nota2;

public class NotaMock extends Nota2 {

	public NotaMock() {
		super(10, "");
	}

	public String getCalificacion() {
		return "Sobresaliente";
	}

}
