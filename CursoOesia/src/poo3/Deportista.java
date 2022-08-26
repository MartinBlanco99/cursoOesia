package poo3;

public class Deportista extends Persona {

	

	public Deportista(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	@Override
	public void andar() {
		System.out.println("el deportista anda a 5 km/hora");
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
}
