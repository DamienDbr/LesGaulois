package personnages;

public class Gaulois {
	private String nom;
	/*private int force;*/
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		
		
	}
	public String getNom() {
		return nom;
		
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}
	/*private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}*/
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		} 
	
	
	
	/* public void frapper(Romain romain, Gaulois gaulois, Druide druide) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		gaulois.boirePotion(gaulois, druide);
		force = force*effetPotion; 
		romain.recevoirCoup(force / 3);
	}    */
	
	
	public void frappeer(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = trophees[i];
		}
		return;
		}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	
	
	public void boirePotion(Gaulois gaulois, Druide druide) {
		effetPotion = druide.preparerPotion();
		gaulois.parler(" Merci Druide, je sens que ma force est "+ effetPotion+" fois décuplée.");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8,1);
		Gaulois obelix = new Gaulois("Obelix",99,1);
		System.out.println(asterix);
		System.out.println(obelix);
		System.out.println(asterix.force);
		System.out.println(asterix.nom);
		System.out.println(asterix.prendreParole());
		asterix.parler("Par Toutatis !");
		obelix.parler("Mais ou sont les sangliers ?");
		Romain cesar = new Romain("Cesar",2);
		cesar.parler("Brutus, mon fils !");
		Druide panoramix = new Druide("Panoramix",1,10,1); 
		asterix.boirePotion(asterix,panoramix);
		System.out.println(" ");

		

	}
}