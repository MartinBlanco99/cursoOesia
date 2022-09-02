package tiposGenercios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaIterable implements Iterable<String> {
	private  List<String> elementos = new ArrayList<String>();
	private int tope;

	public BolsaIterable(int tope) {
		super();
		this.tope = tope;
	}

	public void add(String elemento) {
		if (elementos.size() < tope)
			elementos.add(elemento);
	}

	public void remove(String elemento) {
		elementos.remove(elemento);
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return elementos.iterator();
	}

}
