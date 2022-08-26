package poo8;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeAsalto {

	private int numeroSoldados;

	private List<Soldado> soldados = new ArrayList<Soldado>();

	
		public EquipoDeAsalto(int numeroSoldados) {
		super();
		this.numeroSoldados = numeroSoldados;
	}
	
	
	public List<Soldado> getSoldados() {
		return soldados;
	}



	public void setSoldados(List<Soldado> soldados) {
		this.soldados = soldados;
	}

	public void addSoldado(Soldado soldado) {
		if (soldados.size() < 5)
			soldados.add(soldado);
	}

	public int getNumeroSoldados() {
		return numeroSoldados;
	}

	public void setNumeroSoldados(int numeroSoldados) {
		this.numeroSoldados = numeroSoldados;
	}

	

	public boolean estaPreparado() {
		boolean tieneConductor = false;
		boolean tieneBuzo = false;
		for (Soldado s : soldados) {
			if (s.isbuzo())
				tieneConductor = true;
			if (s.isConductor())
				tieneBuzo = true;
		}
		System.out.println(tieneConductor);
		System.out.println(tieneBuzo);
		System.out.println(soldados.size());

		if (soldados.size() == numeroSoldados && tieneBuzo && tieneConductor)
			return true;
		else
			return false;
	}
	
	public void disparar() {
		for(Soldado s : soldados) {
			s.disparar();
		}
	}
}
