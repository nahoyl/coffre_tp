package etat;

import metier.Coffre;

public class EtatBloque extends AbsEtatCoffre{

	private static AbsEtatCoffre instance;
	
	public String toString(){
		return "Bloque";
	}
	
	public static AbsEtatCoffre getInstance(){
		if(instance == null)
			instance = new EtatBloque();
		return instance;
	}
}
