package etat;

import metier.Coffre;

public class EtatFerme extends AbsEtatVisible{
	
	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setChienLibere(true);
		coffre.setEtat(new EtatPresqueOuvert());
		
	}

	@Override
	public String toString() {
		return "Ferme";
	}
	
}
