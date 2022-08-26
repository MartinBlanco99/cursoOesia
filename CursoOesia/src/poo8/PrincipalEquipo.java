package poo8;

public class PrincipalEquipo {

	public static void main(String[] args) {
		SoldadoEjercitoTierra s1 = new SoldadoEjercitoTierra();
		SoldadoEjercitoTierra s2 = new SoldadoEjercitoTierra();

		SoldadoEjercitoTierra s3 = new SoldadoEjercitoTierra();
		
		EquipoDeAsalto e = new EquipoDeAsalto(5);
		e.addSoldado(s1);
		e.addSoldado(s2);
		e.addSoldado(s3);
		
		e.addSoldado(new SoldadoEjercitoTierraEspia());
		e.addSoldado(new SoldadoEjercitoTierraEspia());
		System.out.println(e.estaPreparado());
		
		System.out.println();
		e.disparar();

	}

}
