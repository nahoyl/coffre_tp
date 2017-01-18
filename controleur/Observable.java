package controleur;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	private List<Observer> obsList = new ArrayList<Observer>();
	
	public void addObserver(Observer obs){
		this.obsList.add(obs);
	}
	
	public void setChanged(){
		
	}
	
	public void notifyObservers(){
		
	}
	
	public void notifyObservers(Object o){
		
	}

}
