package poo8;

public class SoldadoEjercitoTierraEspia implements SoldadoSeal {

	@Override
	public void conducir() {
		System.out.println("el espia de tierra conduce");

	}

	@Override
	public void mover() {

		System.out.println("el espia de tierra se mueve");

	}

	@Override
	public void disparar() {

		System.out.println("el espia de tierra dispara");

	}

	@Override
	public void bucear() {
		System.out.println("el espia  de tierra bucea");

	}

	@Override
	public boolean isbuzo() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isConductor() {
		// TODO Auto-generated method stub
		return true;
	}

}
