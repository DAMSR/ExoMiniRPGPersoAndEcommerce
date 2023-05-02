package RPG;

import java.util.Random;

public class StaticData {
	private static final String[] listeAdjectifs = { "De pierre", "Filiforme", "Robuste", "Cassant", "Génial",
			"de diamant", "de fer", "en mousse", "moche", "le glorieux", "de lin", "le breton", "le flamand",
			"le ch'ti" };
	private static final String[] listeNoms = { "Alfred", "José", "Herbert", "Robert", "Dammian", "Anais", "Simon",
			"Samuel" };
	private static final String[] listeNomsArme = { "Canif", "Masse", "Gourdin", "Santoku", "Tourne-vis", "Marteau",
			"Pistolet a clou" };
	private static final String[] listeNomsArmure = { "Pagne", "Côte de maille", "Robe", "Bikini", "Calecon",
			"Grand manteau", "Cape", "Cuirrasse", "Bouclier" };

	public static final Armure[] listeArmures = { new Armure(StaticData.GenererNomArmure(), 1, 1),
			new Armure(StaticData.GenererNomArmure(), 1, 2), new Armure(StaticData.GenererNomArmure(), 1, 3),
			new Armure(StaticData.GenererNomArmure(), 1, 4), new Armure(StaticData.GenererNomArmure(), 1, 5),
			new Armure(StaticData.GenererNomArmure(), 1, 10), new Armure(StaticData.GenererNomArmure(), 1, 15),
			new Armure(StaticData.GenererNomArmure(), 1, 20), };
	public static final Arme[] listeArmes = { new Arme(StaticData.GenererNomArme(), 1, 1),
			new Arme(StaticData.GenererNomArme(), 1, 2), new Arme(StaticData.GenererNomArme(), 1, 3),
			new Arme(StaticData.GenererNomArme(), 1, 4), new Arme(StaticData.GenererNomArme(), 1, 5),
			new Arme(StaticData.GenererNomArme(), 1, 10), new Arme(StaticData.GenererNomArme(), 1, 15),
			new Arme(StaticData.GenererNomArme(), 1, 20), };

	public static String GenererNom() {
		return StaticData.GenererAssociation(StaticData.listeNoms, StaticData.listeAdjectifs);
	}

	public static String GenererNomArme() {
		return StaticData.GenererAssociation(StaticData.listeNomsArme, StaticData.listeAdjectifs);
	}

	public static String GenererNomArmure() {
		return StaticData.GenererAssociation(StaticData.listeNomsArmure, StaticData.listeAdjectifs);
	}

	/**
	 * Concatene deux chaines de caractere aléatoirement choisit parmis deux
	 * tableaux
	 * 
	 * @param tableau1 un nom ?
	 * @param tableau2 un adjectif ?
	 * @return une chaine de caractère aléatoire
	 */
	public static String GenererAssociation(String[] tableau1, String[] tableau2) {
		Random rand = new Random();
		return tableau1[rand.nextInt(tableau1.length)] + " " + tableau2[rand.nextInt(tableau2.length)];
	}
}