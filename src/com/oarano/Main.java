package com.oarano;

import java.util.ArrayList;
import java.util.List;

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


    }
}
