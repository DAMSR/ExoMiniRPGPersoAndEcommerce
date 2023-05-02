package RPG;

import java.util.Random;

public class Piege implements Evenement {
	private Personnage hero;

	public Piege(Personnage hero) {
		this.hero = hero;
	}

	@Override
	public Personnage resoudre() {
		Random rand = new Random();
		if (rand.nextBoolean())
			hero.setPv(hero.getPv() - 10);
		else
			hero.setPv(hero.getPv() + 10);

		return hero;
	}

}