package tiposGenercios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaIterable2<T> implements Iterable<T> {
	private  List<T> elementos = new ArrayList<T>();
	private int tope;

	public BolsaIterable2(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T elemento) {
		if (elementos.size() < tope)
			elementos.add(elemento);
	}

	public void remove(String elemento) {
		elementos.remove(elemento);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return elementos.iterator();
	}

}
