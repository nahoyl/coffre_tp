package etat;

import metier.Coffre;

public abstract class AbsEtatCoffre{

	public void oterLivre(Coffre coffre) {}

	public void remettreLivre(Coffre coffre) {}

	public void tournerChandelleVersDroite(Coffre coffre) {}

	public void tournerChandelleVersGauche(Coffre coffre) {}

	public void fermerCoffre(Coffre coffre) {}
	
}
