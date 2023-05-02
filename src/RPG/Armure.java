package RPG;

public class Armure implements Objet {
	private String nom = "";
	private int poids = 0;
	private float defense = 1;

	/**
	 * @return the defense
	 */
	public float getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(float defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public Armure(String nom, int poids, float defense) {
		this.nom = nom;
		this.poids = poids;
		this.defense = defense;
	}

	@Override
	public void utiliser(Personnage cible) {
		cible.setArmure(this);
		System.out.println(cible + " porte maintenant : " + this);
	}

	@Override
	public String getNom() {
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
}