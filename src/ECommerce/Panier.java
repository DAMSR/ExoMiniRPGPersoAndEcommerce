package ECommerce;

import java.util.List;
import java.util.ArrayList;

public class Panier {
	ArrayList<Article> produits = new ArrayList<Article>();
	
	void ajouterArticle(Article article) {
		this.produits.add(article);
	}
	
	void retirerArticle(int index) {
		if(index >= 0 && index < this.produits.size())
			this.produits.remove(index);
	}
	
	void afficherPanier() {
		System.out.println("Voici la liste des produits dans le panier :");
		float total = 0;
		for(int i = 0; i < produits.size(); i++) {
			total+=this.produits.get(i).prix;
			System.out.println(i+" : "+this.produits.get(i).nom+" : "+this.produits.get(i).prix);
		}
		System.out.println("Total : "+total);
	}
	
}
