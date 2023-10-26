package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",0);
		Gaulois obelix = new Gaulois("Obelix",8);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("« Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booste(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		
			
		asterix.parler("Bonjour");

		asterix.parler("« UN GAU... UN GAUGAU...");

		asterix.frapper(minus);
	
		
	}

}
