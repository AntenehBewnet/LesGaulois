package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom
		+ " et ma potion peut aller d'une force " + effetPotionMin + " à "
		+ effetPotionMax + ".");
	}
	
	public int preparerPotion() {
		Random random = new Random();
        int forcePotion = random.nextInt(effetPotionMin ,effetPotionMax + 1);
        
        if (forcePotion > 7) {
            System.out.println("J'ai préparé une super potion de force " + forcePotion);
        } else {
            System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
        }
        return forcePotion;
	}
	
	public void booste(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix") {
			parler("Non, Obélix !... Tu n’auras pas de potion\n magique ! ");
		} else {
			gaulois.boirePotion(forcePotion);
		}
		
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return "Druide [nom=" + nom + ", effetPotionMin=" + effetPotionMin + ", effetPotionMax= " + effetPotionMax+"]";
	}

	
	public static void main(String[] args) {
		Druide yuh = new Druide("Yuh",5,10);
	}
}
