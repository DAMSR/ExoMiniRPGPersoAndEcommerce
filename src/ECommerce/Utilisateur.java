package ECommerce;

public class Utilisateur {
	protected String nom;
	protected String adresse;
	private Panier panier = new Panier();
	private Commande[] commandes;
	
	Utilisateur(String nom, String adresse){
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	String consulterCommande() {
		return "J'ai commandé plein de choses !";
	}
	
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	public Panier getPanier() {
		return this.panier;
	}
}
