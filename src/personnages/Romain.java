package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	public int nbEquipement = 0;
	private String texte;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	/*
	public void recevoirCoup(int forceCoup) {
		assert force>0 :"La force doit être supérieure à 0 avant l'attaque";
		int forceTemp = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert force<forceTemp : "La force doit avoir diminué après l'attaque";	
	}*/
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s envole sous la force du coup.");
		
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
				} else {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
				}
				return equipementEjecte;
				}

		

	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de"
		  + forceCoup;
		int resistanceEquipement = 0;
		if(nbEquipement != 0){
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null &&
						equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}

	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
		parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
			// post condition la force à diminuer
			assert force < oldForce;
			return equipementEjecte;
			}
	
	

	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
			case 2: {
				System.out.println("Le soldat " + nom + " est deja bien protege!");
				break;
			}
			case 1: {
				if (equipements[0] == equipement){
					System.out.println("Le soldat " + nom + " possede deja un " + 
							equipement + " !");
					break;
				} else {
					equipement(equipement);
					System.out.println("Le soldat Minus s’équipe avec un "+equipement);
					break;
				}
			}
			default : {
				equipement(equipement);
				System.out.println("Le soldat Minus s’équipe avec un "+equipement);
				break;
			}
		}
	}
	private void equipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		
	}
	
	public static void main(String[] args) {
		Romain brutus = new Romain("Brutus",4);
		Romain minus = new Romain("Minus",3);
		/*Romain cesar = new Romain("Cesar",-4);*/
		/*java.lang.AssertionError*/
		System.out.println(brutus.prendreParole());
		System.out.println("C'est moi !");
		brutus.parler("Adieu C�sar...");
		brutus.recevoirCoup(5);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
