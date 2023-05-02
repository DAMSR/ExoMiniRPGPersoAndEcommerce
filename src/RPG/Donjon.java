package RPG;

import java.util.ArrayList;
import java.util.Random;

public class Donjon {
	private Personnage hero;
	private ArrayList<Evenement> pieces = new ArrayList<Evenement>();

	public Donjon(Personnage hero, int nbPieces) {
		Random rand = new Random();

		this.hero = hero;

		/**
		 * Générateur de pièces
		 */
		for (int i = 0; i < nbPieces; i++) {
			if (rand.nextBoolean()) {
				// Si on rencontre un monstre
				pieces.add(new Combat(this.hero,
						new Personnage(StaticData.GenererNom(), rand.nextFloat(5f * (i + 1), 10f * (i + 1)),
								StaticData.listeArmes[i], StaticData.listeArmures[i])));
			} else {
				// Si on rencontre un piège
				pieces.add(new Piege(this.hero));
			}
		}
	}

	public void run() {
		// Parcourir le donjon salle par salle
		for (int i = 0; i < this.pieces.size(); i++) {
			System.out.println(this.pieces.get(i).resoudre());
		}
	}
}