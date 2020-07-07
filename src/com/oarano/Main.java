package com.oarano;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creer une list qui va stocker une liste de chaque chapitre de l'ouvrage
        List<String> chapitres = new ArrayList<>();
        chapitres.add("Chapitre I: Qu'est ce que JAVA ?");
        chapitres.add("Chapitre II: Qu'est ce qu'une variable");
        chapitres.add("Chapitre III: Les conditions");
        chapitres.add("Chapitre IV: Les tableaux");

        // affichage des caractéristiques du livre
        System.out.println("Titre de l'ouvrage: Base de la programmation");
        System.out.println("Nom de l'auteur: KatzoA");
        System.out.println("Sociéte éditrice: AoztaK");

        System.out.println("Sommaire:");

        // affichage du sommaire
        for(String c : chapitres){
            System.out.println("Le nom du chapitre est:  " + c);
        }
        // affichage du sommaire via foreach lambda
        /*chapitres.forEach(chapitre -> System.out.println(chapitre));*/

        // chapitre 1
        List<String> chapitre1 = new ArrayList<>();
        chapitre1.add("Bienvenue sur le premier chapitre");

        // chapitre 2
        List<String> chapitre2 = new ArrayList<>();
        chapitre2.add("Bienvenue sur le premier deux");

        // chapitre 3
        List<String> chapitre3 = new ArrayList<>();
        chapitre3.add("Bienvenue sur le premier trois");

        // creer une nouvelle instance du livre
        Livre livre = new Livre("Les bases de la programmation");
        livre.ajouterPage(chapitre1);
        livre.ajouterPage(chapitre2);
        livre.ajouterPage(chapitre3);
        System.out.println(livre.getNom() + " nombres de pages " + livre.getNombrePages());

        // proposer à l'utilisateur d'entrée un numéro de page
        Scanner scan = new Scanner(System.in);
        int choixPage = scan.nextInt();
        System.out.println("Page à lire: " + choixPage);

        // vérification de la page séléctionnée
        if(livre.getNombrePages() >= choixPage && choixPage > 0){
            List<String> lignes = livre.getPage(choixPage - 1 );
            lignes.forEach(ligne -> System.out.println(ligne));
        }

        // demander si on va sur la page d'avant ou d'apres
        System.out.println("Taper 1. Pour aller sur la page d'avant - Taper 2. pour aller sur la page d'apres");
        int choixAvantApresPage = scan.nextInt();

        if(choixAvantApresPage == 1){
            // page d'avant
            choixPage = choixPage - 1;
            if(livre.getNombrePages() >= choixPage && choixPage > 0){
                List<String> lignes = livre.getPage(choixPage - 1 );
                lignes.forEach(ligne -> System.out.println(ligne));
            }

        }else if(choixAvantApresPage == 2){
            // page d'apres
            choixPage = choixPage + 1;
            if(livre.getNombrePages() >= choixPage && choixPage > 0){
                List<String> lignes = livre.getPage(choixPage - 1 );
                lignes.forEach(ligne -> System.out.println(ligne));
            }

        }


    }
}
