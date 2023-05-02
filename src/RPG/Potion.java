package RPG;

import java.util.ArrayList;

public class Potion implements Objet {
	private String nom;
	private int poids = 0;
	private ArrayList<Effet> effects = new ArrayList<Effet>();

	public Potion(String nom, int poids, ArrayList<Effet> effects) {
		this.nom = nom;
		this.poids = poids;
		this.effects = effects;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int getPoids() {
		return this.poids;
	}

	@Override
	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public void utiliser(Personnage cible) {
		for (Effet effect : this.effects) {
			effect.resoudre(cible);
		}
	}

}