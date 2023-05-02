package RPG;

public interface Objet {

	/**
	 * @return the nom
	 */
	public String getNom();

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom);

	/**
	 * @return the poids
	 */
	public int getPoids();

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids);

	public void utiliser(Personnage cible);

	// public void utiliser(Personnage cible, Personnage from);
}