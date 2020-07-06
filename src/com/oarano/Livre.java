package com.oarano;

import java.util.ArrayList;
import java.util.List;

public class Livre {

    // attributs
    private String nomLivre;
    private List<Page> page;

    // constructeur
    public Livre(String nomLivre){
        this.nomLivre = nomLivre;
        this.page = new ArrayList<>();
    }


    // méthodes
    public void ajouterPage(List<String>lignes){
    //creer la page
        Page nouvellePage = new Page(lignes);
        page.add(nouvellePage);
    }
    public int getNombrePages(){
        return this.page.size();
    }

    public String getNom(){
        return nomLivre;
    }
}

