package lambdas.personas;

@FunctionalInterface
public interface Filtro<T> {
	boolean filtrar(T tipo);

}
