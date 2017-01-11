package etat;

import metier.Coffre;

public class EtatPresqueOuvert extends AbsEtatVisible{
	
	@Override
	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setEtat(new EtatOuvert());
	}

	@Override
	public String toString() {
		return "PresqueOuvert";
	}
	
}
