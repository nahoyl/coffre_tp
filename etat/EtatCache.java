package etat;

import metier.Coffre;

public class EtatCache extends AbsEtatCoffre{

	public void oterLivre(Coffre coffre) {
		coffre.setEtat(new EtatFerme());
	}

	@Override
	public String toString() {
		return "CacheParBibliotheque";
	}


}
