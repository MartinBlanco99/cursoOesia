package tiposGenercios;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
	private List<String> elementos = new ArrayList<String>();
	private int tope;

	public Bolsa() {
		super();
	}
	
	

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}



	public Bolsa(List<String> elementos) {
		super();
		this.elementos = elementos;
	}

	public List<String> getElementos() {
		return elementos;
	}

	public void setElementos(List<String> elementos) {

		this.elementos = elementos;
	}

	public void addElemento(String elemento) {
		if (elementos.size() < tope)
			elementos.add(elemento);
	}

	public void removeElemnto(String elemento) {
		elementos.remove(elemento);
	}

}
