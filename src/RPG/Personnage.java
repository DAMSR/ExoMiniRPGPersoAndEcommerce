package RPG;

import java.util.ArrayList;

public class Personnage {
	private float pv;
	private String nom;
	private Arme arme;
	private Armure armure;
	private ArrayList<Objet> inventaire = new ArrayList<Objet>();

	public Personnage(String nom, float pv, Arme arme, Armure armure) {
		this.nom = nom;
		this.pv = pv;
		this.arme = arme;
		this.armure = armure;
	}

	public Personnage() {
	}

	@Override
	public String toString() {
		return this.getNom() + " (" + this.getPv() + "PV)";
	}

	/**
	 * @return the inventaire
	 */
	public ArrayList<Objet> getInventaire() {
		return inventaire;
	}

	/**
	 * @param inventaire the inventaire to set
	 */
	public void setInventaire(ArrayList<Objet> inventaire) {
		this.inventaire = inventaire;
	}

	/**
	 * @return the pv
	 */
	public float getPv() {
		return pv;
	}

	/**
	 * @param pv the pv to set
	 */
	public void setPv(float pv) {
		this.pv = pv;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the arme
	 */
	public Arme getArme() {
		return arme;
	}

	/**
	 * @param arme the arme to set
	 */
	public void setArme(Arme arme) {
		if (this.arme != null)
			inventaire.add(this.arme);

		this.arme = arme;
	}

	/**
	 * @return the armure
	 */
	public Armure getArmure() {
		return armure;
	}

	/**
	 * @param armure the armure to set
	 */
	public void setArmure(Armure armure) {
		if (this.armure != null)
			this.inventaire.add(this.armure);

		this.armure = armure;
	}

	public void combattre(Personnage autre) {
		float degats = (this.getArme() != null) ? this.getArme().getDegats() : 0;
		degats -= (autre.getArmure() != null) ? autre.getArmure().getDefense() * 0.1f : 0;

		degats = (degats > 0) ? degats : 0;

		autre.setPv(autre.getPv() - degats);
	}

	/**
	 * Le personnage est-il encore en vie ?
	 * 
	 * @return boolean
	 */
	public boolean IsAlive() {
		return this.getPv() > 0;
	}

	public void Piller(Personnage autre) {
		if (this.getArmure().getDefense() < autre.getArmure().getDefense())
			autre.getArmure().utiliser(this);
		else
			this.getInventaire().add(autre.getArmure());

		if (this.getArme().getDegats() < autre.getArme().getDegats())
			autre.getArme().utiliser(this);
		else
			this.getInventaire().add(autre.getArme());
	}
}