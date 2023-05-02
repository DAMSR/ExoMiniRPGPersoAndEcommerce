package ECommerce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commande {
	List<Article> produits = new ArrayList<Article>();
	LocalDate dateCommande;
	LocalDate dateLivraison;
	
	Commande(List<Article> produits){
		this.produits = produits;
	}
}
