package RPG.Effets;

import RPG.Effet;
import RPG.Personnage;

public class Degats extends Effet{
	private float hp = 5;
	
	public Degats(float hp) {
		this.hp = hp;
	}
	@Override
	public void resoudre(Personnage cible) {
		System.out.println(cible + " est blessé de "+this.hp+" PV");
		cible.setPv(cible.getPv() - this.hp);
	}

}