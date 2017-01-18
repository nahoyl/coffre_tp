package metier;

import controleur.Observable;
import etat.AbsEtatCoffre;
import etat.AbsEtatVisible;
import etat.EtatCache;


public class Coffre 
extends Observable
implements I_CoffreChateau
{

	private boolean chienLibere = false;
	private boolean lapinLibere = false;
	private AbsEtatCoffre etat;
	
	public Coffre(){
		etat = new EtatCache();
	}
	
	
	public void setChienLibere(boolean chienLibere) {
		this.chienLibere = chienLibere;
	}

	public void setLapinLibere(boolean lapinLibere) {
		this.lapinLibere = lapinLibere;
	}

	public void oterLivre(){
		etat.oterLivre(this);
	};

	public void remettreLivre() {
		etat.remettreLivre(this);
	};

	public void tournerChandelleVersDroite() {
		etat.tournerChandelleVersDroite(this);
	};

	public void tournerChandelleVersGauche() {
		etat.tournerChandelleVersGauche(this);
	};

	public void fermerCoffre() {
		etat.fermerCoffre(this);
	}

	public boolean lapinEstLibere() {
		return this.lapinLibere;
	}

	public boolean chienEstLibere() {
		return this.chienLibere;
	}
	
	public String nomEtat() {
		return this.etat.toString();
	}
	
	public void setEtat(AbsEtatCoffre etatCoffre){
		etat = etatCoffre;
	}
	
}
