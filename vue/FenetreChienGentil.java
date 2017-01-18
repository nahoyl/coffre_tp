package vue;

import java.awt.*;

import javax.swing.*;

import controleur.Observable;
import controleur.Observer;

public class FenetreChienGentil extends JFrame implements Observer {

	private JTextField txtChien;

	public FenetreChienGentil()
	{
		setTitle("Chien du Chateau M�di�val");
		setBounds(300,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labChien = new JLabel ("CHIEN");
		contentPane.add(labChien);
		txtChien = new JTextField(15);
		contentPane.add(txtChien);
		setVisible(true);
		afficherChien(false);
	}
	
	public void afficherChien(boolean libre)
	{
		if (libre == true)
			txtChien.setText("Le chien gentil est lib�r�");
		else 
			txtChien.setText("Le chien gentil est enferm�");
	}

	@Override
	public void update(Observable obs, Object o) {
		// TODO Auto-generated method stub
		
	}
}