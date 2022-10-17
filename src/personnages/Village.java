package personnages;

public class Village {
	private String nom;
	private Chef chef;
	public int nbVillageois = 0;
	public int nbVillageoisMaximum = 30;
	public String[] villageois = new String[nbVillageoisMaximum];
	public Village(String nom) {
	this.nom = nom;
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			
			villageois[nbVillageois] = gaulois.getNom();
			nbVillageois += 1;
			
		}
	}
	public void ajouterChef(Chef chef) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = chef.getNom();
			nbVillageois += 1;
			
		}
	}
	public String trouverHabitant(int numeroHabitant) {
		return villageois[numeroHabitant];	
	}
	public void afficherVillageois() {
		System.out.println("Voici nos Gaulois préférés :");
		for(int i=0;i<nbVillageois;i++) {
			System.out.println(villageois[i]);
		}
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8,1);
		Gaulois obelix = new Gaulois("Obelix",25,1);
		Village village = new Village("Village des Irréductibles");
		System.out.println(village.nbVillageoisMaximum);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		System.out.println(village.nbVillageois);
		System.out.println(village.trouverHabitant(0));
		System.out.println(village.trouverHabitant(29));
		/*System.out.println(village.trouverHabitant(30));*/
		 /*habitant 29 = null, habitant 30 : Index 30 out of bounds for length 30
		 Comme on compte le 0, l'indice 30 est la 31 ème valeur ce qui dépasse 
		 la longueur du tableau.
		 */
		Chef abraracourcix = new Chef("Abraracourcix",6,1,village);
		village.ajouterChef(abraracourcix);
		System.out.println(village.nbVillageois);
		/*Gaulois gaulois = village.trouverHabitant(1);
		Type mismatch: cannot convert from String to Gaulois */
		/* System.out.println(gaulois);
		 * gaulois cannot be resolved to a variable */
		village.afficherVillageois();
		 
	}
}
