package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		/*
		Gaulois asterix = new Gaulois("Ast�rix",8,1);
		Romain minus = new Romain("Minus",5);
		Druide panoramix = new Druide("Panoramix",1,10,1); 
		asterix.parler("� Bonjour � tous");
		minus.parler("� UN GAU... UN GAUGAU..");
		while (minus.getForce() > 0) {
			asterix.frapper(minus,asterix,panoramix);
		}
		System.out.println(); */
		Gaulois asterix = new Gaulois("Asterix",5,1);
		Druide panoramix = new Druide("Panoramix",1,10,1);
		Gaulois obelix = new Gaulois("Obelix",99,1);
		Romain minus = new Romain("Minus",30);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix, panoramix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(asterix, panoramix);
		asterix.parler("Bonjour !");
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus,asterix,panoramix);
		}
				
	}

}
