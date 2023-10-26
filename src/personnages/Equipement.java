package personnages;

public enum Equipement {
	CASQUE("casque") , BOUCLIER("bouclier");
	private String nom;
	
	Equipement(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	public static void main(String[] args) {
		Equipement[] equipements = new Equipement[2];
		equipements[0] = CASQUE;
		System.out.println(equipements[0]);
	}
}




