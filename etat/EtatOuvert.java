package etat;

import metier.Coffre;

public class EtatOuvert extends AbsEtatCoffre{

	public void fermerCoffre(Coffre coffre) {
		coffre.setEtat(new EtatFerme());
	}
	
	public String toString(){
		return "Ouvert";
	}

}
