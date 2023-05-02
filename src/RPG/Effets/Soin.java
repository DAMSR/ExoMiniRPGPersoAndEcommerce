package RPG.Effets;

import RPG.Effet;
import RPG.Personnage;

public class Soin extends Effet{
	private float hp = 5;
	
	public Soin(float hp) {
		this.hp = hp;
	}
	@Override
	public void resoudre(Personnage cible) {
		System.out.println(cible + " est soigné de "+this.hp+" PV");
		cible.setPv(cible.getPv() + this.hp);
	}

}
