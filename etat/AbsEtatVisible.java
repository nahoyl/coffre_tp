package etat;

import metier.Coffre;

public abstract class AbsEtatVisible extends AbsEtatCoffre{

	public void tournerChandelleVersGauche(Coffre coffre) {
		coffre.setLapinLibere(true);
		coffre.setEtat(EtatBloque.getInstance());
	}
	
	public void remettreLivre(Coffre coffre) {
		coffre.setEtat(new EtatCache());
		coffre.setChienLibere(false);
	}

}
