package RPG;

public class Arme implements Objet {
	private String nom = "";
	private float degats = 1;
	private int poids = 0;

	/**
	 * @return the degats
	 */
	public float getDegats() {
		return degats;
	}

	/**
	 * @param degats the degats to set
	 */
	public void setDegats(float degats) {
		this.degats = degats;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public Arme(String nom, int poids, float degats) {
		this.nom = nom;
		this.poids = poids;
		this.degats = degats;
	}

	@Override
	public void utiliser(Personnage cible) {
		cible.setArme(this);
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