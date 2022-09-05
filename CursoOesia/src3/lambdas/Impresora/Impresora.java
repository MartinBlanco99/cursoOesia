package lambdas.Impresora;

public interface Impresora {

	public void imprimir();

	public int velocidad();

	public default boolean esMasRapida(Impresora otra) {
		return this.velocidad() > otra.velocidad();
	}

	public static Impresora masRapida(Impresora... impresoras) {
		Impresora seleccionada = impresoras[0];

		for (Impresora i : impresoras) {
			if (!seleccionada.esMasRapida(i)) {
				seleccionada = i;
			}
		}
		return seleccionada;
	}

}
