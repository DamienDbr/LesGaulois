package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin=0;
	private int effetPotionMax;
	private int forcePotion = 1;
	public Druide(String nom, int effetPotionMax, int forcePotion) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = forcePotion;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force"
				 + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public int preparerPotion() {
		Random random = new Random();
		/*for(int i=0;i<15;i++) {
			int force2 = random.nextInt((effetPotionMax-effetPotionMin)+1)+effetPotionMin;
			System.out.println(force2); 
		} */     
		int force = random.nextInt((effetPotionMax-effetPotionMin)+1)+effetPotionMin;
		forcePotion = force;
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force "+forcePotion);		
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+forcePotion);
		}
		return force;

	}
	public void booster(Gaulois gaulois, Druide druide){
		if (gaulois.getNom() == "Obelix") {
			System.out.println("Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(gaulois,druide);
		}
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",10,1);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",99);
		panoramix.booster(asterix, panoramix);
		System.out.println();
		panoramix.booster(obelix, panoramix);
		System.out.println();
		
				
	}
}
