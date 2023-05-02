package RPG;

public class Combat implements Evenement {
	private Personnage hero;
	private Personnage hero2;

	public Combat(Personnage hero, Personnage hero2) {
		this.hero = hero;
		this.hero2 = hero2;
	}

	@Override
	public Personnage resoudre() {
		// Fonction de combat anciennement dans main
		while (hero.IsAlive() && hero2.IsAlive()) {
			System.out.println(hero.getNom() + " attaque " + hero2.getNom());
			hero.combattre(hero2);
			System.out.println(hero.toString());
			System.out.println(hero2.toString());
			if (hero2.IsAlive()) {
				System.out.println(hero2.getNom() + " riposte");
				hero2.combattre(hero);
				System.out.println(hero.toString());
				System.out.println(hero2.toString());
			}
		}

		if (hero.IsAlive())
			hero.Piller(hero2);
		else
			hero2.Piller(hero);

		// On renvoi le vainqueur du combat
		return (hero.IsAlive()) ? hero : hero2;
	}
}