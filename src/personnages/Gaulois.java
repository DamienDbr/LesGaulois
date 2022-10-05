package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
		
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	@Override
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Obelix",99);
		System.out.println(asterix);
		System.out.println(obelix);
		System.out.println(asterix.force);
		System.out.println(asterix.nom);
		System.out.println(asterix.prendreParole());
		asterix.parler("Par Toutatis !");
		obelix.parler("Mais o� sont les sangliers ?");
		Romain cesar = new Romain("Cesar",2);
		cesar.parler("Brutus, mon fils !");
		asterix.frapper(cesar);

	}
}


