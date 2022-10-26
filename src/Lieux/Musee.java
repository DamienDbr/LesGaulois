package Lieux;

import objets.Equipement;
import objets.Trophee;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee;
	

	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		trophees[nbTrophee]=trophee;
		nbTrophee++;
	}
	public void extraireInstructionsCaml() {
		
	}
}
