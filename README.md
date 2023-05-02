# miniRPG
Mini projet de RPG fait dans le cadre de la formation M2I

## Etape 2 / Step 2 : Jean Paul vs Evil
1. Créer un "donjon" :
- dans le "main" créer un tableau (ou une liste) d'ennemis <Personnage>

2. Faire combattre Jean-Paul contre cette liste d'ennemis (jusqu'à la mort ou la victoire)

3. Générateur d'ennemis : 
- Au lieu de créer les ennemis <Personnage> à la main, nous allons générer des valeurs aléatoires pour leurs statistiques
---
1. Generate a Dungeon :
- in the "main" function of you app, generate an array (or a list) of enemies <Personnage>

2. Jean Paul will fight each enemy of this list he dies or defeat all enemis (Victory)

3. Enemy generation : 
-Instead of manualy create enemies <Personnage>, generate random values for their stats (life points, possibly names and weapons / armor)

## Etape 3 / Step 3 : Combat system update.

L'objectif est de permettre l'amélioration du système de combat, le but est de le rendre plus flexible
- Créer une classe combat, avec 2 attributs Personnages
- Créer une méthode "résoudre combat" : il devra résoudre un combat entre ces deux personnages en reprenant le code précédemment créé dans "main"
- Créer un constructeur associé à cette classe (Personnage p1, Personnage, p2)
- Laisser le reste du main tel-quel (générateur de monstre / personnage), utilisez la nouvelle classe Combat dans la zone associée
---
The main objective is to upgrade the combat system and add flexibility to it
- Create a new class called "Fight", it should have 2 attributs <Personnage>
- Create a method to resolve the fight : it must resolve a fight between those two character. You must use the previous code written your "main function"
- Create the constructors associated to that class (Personnage p1, Personnage, p2)
- Leave the main function as-is for the moment (character generators) just replace the previous combat system with the new class

## Etape 4 / Step 4 : Dungeon Update !
Cette fois-ci on va s'occuper de créer la fonctionnalité Donjon, encore une fois pour décharger le main et rendre notre code plus flexible
- Créer la classe Donjon
- Elle aura un attribut qui contiendra la liste des monstres à combattre
- Elle aura la responsabilité de générer les monstres
- Elle aura la responsabilité de faire combattre le héro contre les monstres du Donjon
- Mettre à jour le code de "main" pour le rendre plus lisible
---
This time we will work on the dungeon feature, again the main objective is to make our project more versatile
- Create a class called Donjon
- This class must will implement an attribute containing the list of ennemies to fight
- it have to generate the ennemies randomly
- it have to automatize combat between the hero and the ennemies previously generated
- update the code from the "main" class

## Etape 5 / Step 5 : ajout de données static
Pour simplifier la génération de données nous allons ajouter des variables static dans une classe dédiée a stocker des informations plus générales sur le jeu.
- Créer une classe "StaticData" qui contiendra : une liste d'armes, une liste d'armures, une liste de nom et d'adjectifs
- Créer des méthodes pour générer des noms aléatoirement pour nos héros, nos armes et nos armures
---
To simplify data generation in our game we will add static variables in a dedicated class. It will be responsible for the core data of the game.
- Create a new class called "StaticData", it will contain : a list (or array) for each of this data : armors, weapons, names and adjectives
- Create new methods to generate a random name for those attributes : hero name, armor name, weapon name

## Etape 6 / Step 6 : Ajouter l'inventaire au Personnage
Nous allons créer un inventaire simple pour notre personnage. Il contiendra des armes et des armures que nous aurons récupéré sur les monstres vaincus.
Pour cela : 
- créer un type "Objet" qui sera la généralisation de nos classe Armes et Armures. Cette classe objet contiendra aussi une notion de "poids".
- Modifier les classe Arme et Armure en conséquence via "extends" pour hériter de "Objet". Mettre à jour les constructeurs, getters, setters
- Mettre à jour le code pour qu'il compile
- Ajouter une ArrayList d'Objet dans Personnage
- Généraliser la notion "équiper" pour que le personnage puisse s'équiper automatiquement d'une arme ou d'une armure sans distinction.
---
We will now create a simple inventory for our character. It will contain all the weapons and armor we will loot on defeated monsters.
To do this :
- create a new class called "Items" that will generalize of our two classes Armor and Weapon. This class will have a new attribute : weight
- Update Armor and Weapon classes to match the new constraints of the "Item" class. Update the constructors, getters and setters
- Update the code for the app to compile
- Add an ArrayList of Items in the Character Class
- Generalise the concept of "equip" for the character to equip an item (armor or weapon) 

## Etape 7 / Step 7 : Ajout du "Loot system"
- Améliorer les setters : si on est déjà équipé => mettre objet en cours dans inventaire puis remplacer par nouveau
- Améliorer combat : 
    - En cas de victoire : 
        Si équipement ennemi > notre équipement actuel => remplacer
        Sinon => mettre dans l'inventaire
		
## Etape 8 / Step 8 : New events !!
- Créer une classe piège : ce sont des évènements spéciaux qui pourront être positifs ou négatifs pour le héro (lui ajouter des points de vie, lui en retirer ?)
- Mettre à jour le donjon : désormais il n'y a plus que des combats de disponible mais aussi des pièges cependant il y a toujours autant de salles dans notre donjon. Il faudra mettre à jour le constructeur du donjon pour pré-générer un donjon avec ces évènements.
- Mettre à jour l'UML, créer les classes qui découlent de ce fonctionnement (héritage ?)