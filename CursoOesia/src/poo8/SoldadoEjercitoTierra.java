package poo8;

public class SoldadoEjercitoTierra implements Soldado {

	@Override
	public void mover() {
		System.out.println("el soldado de tierra se mueve");
		
	}

	@Override
	public void disparar() {
		System.out.println("el solado de tierra dispara");
		
	}

	@Override
	public boolean isbuzo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConductor() {
		// TODO Auto-generated method stub
		return false;
	}

}
