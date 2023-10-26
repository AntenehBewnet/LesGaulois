package personnages;

public class Villages {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	
	
	public Villages(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois+1] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les legendaires gaulois:");
		for (Gaulois gaulois : villageois) {
			if (gaulois != null) {
				System.out.println("-" + gaulois.getNom());
			}
			
		}
		
	
	}
	public String getNom() {
		return nom;
	}
	
	
	public static void main(String[] args) {
		Villages village = new Villages("Village des Irréductibles",30);
		System.out.println(village);
		
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(asterix);
		/*Gaulois gaulois = village.trouverHabitant(1); */
		village.afficherVillageois(abraracourcix);



 /*   	Gaulois gaulois = village.trouverHabitant(30) */

	}


	
	
	
	
	
	
}

