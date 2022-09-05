package lambdas;

@FunctionalInterface
public interface Filtro<T> {
	boolean filtrar(T tipo);

}
