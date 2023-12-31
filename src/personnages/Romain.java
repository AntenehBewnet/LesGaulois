package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;


	
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force doit etre positif";
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	
//	public void recevoirCoup(int forceCoup) {
//		assert force > 0 : "la force d�un Romain est positive";
//		int temp = force; 
//		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert temp > force : "la force d�un Romain a diminu�";
//		
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
	    if (force > 0) {
	    	parler("A�e");
		 } else {
			 equipementEjecte = ejecterEquipement();
			 parler("J'abandonne...");
		 }

			// post condition la force a diminu�e
			assert force < oldForce;
			return equipementEjecte;
			}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
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
	
	
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[nbEquipement];
			System.out.println("L'�quipement de " + nom.toString() + "s'envole sous la force du coup.");
			int nbEquipementEjecte = 0;
			for (int i = 0; i < nbEquipement; i++) {
				if (equipements[i] == null) {
				} else {
					equipementEjecte[nbEquipementEjecte] = equipements[i];
					nbEquipementEjecte++;
					equipements[i] = null;
				}
			}
			return equipementEjecte;
		}


	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !");
			break;
		case 1:

					if (equipements[0] == equipement) {
						System.out.println("Le soldat " + nom  + " poss�de d�j� un " + equipement + "!");
						break;
					} 
					else {
						nbEquipement += 1;
						equipements[0] = Equipement.CASQUE;
						System.out.println("Le soldat " + nom  + " s��quipe avec un " + equipement + "!");

					}
						
					
			
			break;	
			

		case 0:
			switch (equipement) {
			case CASQUE:
				nbEquipement += 1;
				equipements[0] = Equipement.CASQUE;
				System.out.println("Le soldat " + nom  + " s��quipe avec un " + equipement + "!");
				break;
			case BOUCLIER:
				nbEquipement += 1;
				equipements[1] = Equipement.BOUCLIER;
				System.out.println("Le soldat " + nom  + " s��quipe avec un " + equipement + "!");
				break;
			
			default:
				break;	
			}	
			break;
			
		default :
			break;		
				
		}
			
					
		
			
	
		
	}
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	
	public int getForce() {
		return force;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

		}
}



