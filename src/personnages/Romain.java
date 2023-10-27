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
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "la force d’un Romain est positive";
		int temp = force; 
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert temp > force : "la force d’un Romain a diminué";
		
	}
	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:

					if (equipements[0] == equipement) {
						System.out.println("Le soldat " + nom  + " possède déjà un " + equipement + "!");
						break;
					} 
					else {
						nbEquipement += 1;
						equipements[0] = Equipement.CASQUE;
						System.out.println("Le soldat " + nom  + " s’équipe avec un " + equipement + "!");

					}
						
					
			
			break;	
			

		case 0:
			switch (equipement) {
			case CASQUE:
				nbEquipement += 1;
				equipements[0] = Equipement.CASQUE;
				System.out.println("Le soldat " + nom  + " s’équipe avec un " + equipement + "!");
				break;
			case BOUCLIER:
				nbEquipement += 1;
				equipements[1] = Equipement.BOUCLIER;
				System.out.println("Le soldat " + nom  + " s’équipe avec un " + equipement + "!");
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

	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

		}
}



