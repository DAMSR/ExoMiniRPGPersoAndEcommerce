package main;

import RPG.Personnage;
import RPG.Donjon;
import RPG.Arme;
import RPG.Armure;
import RPG.Combat;
import RPG.StaticData;

import java.util.ArrayList;
import java.util.Random;

public class RPG {
	public static void main(String[] args) {
		// On créé notre héro
		Personnage hero = new Personnage("Jean-Paul", 
				100, 
				StaticData.listeArmes[2], 
				StaticData.listeArmures[2]
						);
		
		// Génère notre donjon
		Donjon donjon = new Donjon(hero, 5);
		// Lancer le départ du donjon
		donjon.run();
		
		if(hero.IsAlive())
			System.out.println("Victoire !");
		else
			System.out.println("Défaite !");
	}
}
