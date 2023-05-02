package ECommerce;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Initialisation de stream input
		Scanner scan = new Scanner(System.in);

		System.out.println("Connexion utilisateur : ");
		System.out.println("Entrez votre nom : ");
		String nom = scan.next();
		System.out.println("Entrez votre adresse :");
		String adresse = scan.next();
		scan.nextLine();
		Utilisateur u1 = new Utilisateur(nom, adresse);
		
		ArrayList<Article> catalogue = new ArrayList<Article>();
		
		catalogue.add(new Article("Stylo", 1, 1.99f));
		catalogue.add(new Article("Crayon", 2, 0.99f));
		
		for(int i = 0; i < catalogue.size(); i++) {
			System.out.println(catalogue.get(i).nom );
		}
		int choix = 0;
		do {
			System.out.println("Que voulez vous faire ?");
			System.out.println("1 : ajouter un produit au panier");
			System.out.println("2 : consulter un produit");
			System.out.println("3 : afficher le panier");
			System.out.println("4 : retirer un produit du panier");
			System.out.println("5 : valider la commande");
			System.out.println("9 : quitter");
			
			choix = scan.nextInt();
			int choixProduit;
			switch(choix) {
				case 1:
					System.out.println("Quel produit souhaitez vous ajouter ?");
					for(int i = 0; i < catalogue.size(); i++) {
						System.out.println(i+" : "+catalogue.get(i).nom);
					}
					// On demande à l'utilisateur de choisir un produit
					choixProduit = scan.nextInt();
					
					// On vérifie que l'index produit est valide
					if(choixProduit >= 0 && choixProduit < catalogue.size()) {
						// On ajoute le produit en question au panier de l'utilisateur en cours
						u1.getPanier().ajouterArticle(catalogue.get(choixProduit));
						System.out.println("Vous avez ajouté " + catalogue.get(choixProduit).nom);
					}
					break;
				case 2:
					System.out.println("Vous souhaitez consulter un produit :");
					for(int i = 0; i < catalogue.size(); i++) {
						System.out.println(i+" : "+catalogue.get(i).nom);
					}
					choixProduit = scan.nextInt();
					
					if(choixProduit >= 0 && choixProduit < catalogue.size())
						System.out.println(catalogue.get(choixProduit).nom +" : "+catalogue.get(choixProduit).prix+ " €");
					break;
				case 3:
					u1.getPanier().afficherPanier();
					break;
				case 4:
					// On affiche un résumé du panier
					u1.getPanier().afficherPanier();
					// On demande à l'utilisateur de choisir le produit à retirer
					System.out.println("Quel produit retirer du panier ?");
					choixProduit = scan.nextInt();
					
					// On retire l'article en question
					u1.getPanier().retirerArticle(choixProduit);
					System.out.println("Article supprimé");
					break;
				case 5:
					u1.getPanier().afficherPanier();
					String conf = scan.next();
					if(conf.equals("o")) {
						/*
						Commande com = new Commande();
						com.produits = u1.panier.produits;
						*/
						Commande com = new Commande(u1.getPanier().produits);
						// Afficher montant total + date livraison
						
						/* Attention si on supprime les éléments de la liste
						 * Cela supprime aussi ceux de la "Commande"
						 * Car c'est un seul et même objet
						u1.panier.produits.clear();
						u1.panier.afficherPanier();
						*/
						u1.setPanier(new Panier());
						/*
						 * u1.panier.produits = new ArrayList<Article>();
						 */
						 com.dateCommande = LocalDate.now();
						 com.dateLivraison = LocalDate.of(2023,04,27);
					}
					
					break;
			}
		} while(choix != 9);
		System.out.println("A bientôt !");
	}

}
